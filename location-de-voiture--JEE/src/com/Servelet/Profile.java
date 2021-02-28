package com.Servelet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.implementations.UserDaoImp;
import com.dao.interfaces.UserDao;
import com.modules.User;
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userdao= new UserDaoImp();
	HttpSession session;
	String forward="";
	String action;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		session = request.getSession();
		action=request.getParameter("action");
		// TODO Auto-generated method stub
		if(session.getAttribute("user")!=null) {
		if(action.equalsIgnoreCase("changepassword")) {
			forward="/WEB-INF/ModifierPassword.jsp";
			
		}else if(action.equalsIgnoreCase("changeinfo"))  {
			User user=new User();
			try {
				user = userdao.findSpecificUserByEmail((String) session.getAttribute("user"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("user", user);
			forward="/WEB-INF/ModifierInfo.jsp";
		}else if(action.equalsIgnoreCase("profile"))   {
			User user=new User();
			try {
				user = userdao.findSpecificUserByEmail((String) session.getAttribute("user"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("user", user);
			forward="/WEB-INF/profile.jsp";
		}
		else if(action.equalsIgnoreCase("supprimercompte"))   {
			try {
				userdao.DeleteUser((String) session.getAttribute("user"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			forward="/WEB-INF/done.jsp";
			session.invalidate();
		}
		}else {
			forward="/WEB-INF/login.jsp";
		}
		request.getRequestDispatcher(forward).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		session = request.getSession();
		action=request.getParameter("action");
		
		if(session.getAttribute("user")!=null) {
		if(action.equalsIgnoreCase("changepassword")) {
			String motdepasse1=request.getParameter("motdepasse1");
			String motdepasse2=request.getParameter("motdepasse2");
			String motdepasse3=request.getParameter("motdepasse3");
			User user = new User();
			try {
				user = userdao.findSpecificUserByEmail((String) session.getAttribute("user"));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(motdepasse1.equals(user.getPassword()) && motdepasse2.equals(motdepasse3)) {
			try {
				userdao.ChangePassword((String) session.getAttribute("user"), motdepasse3);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			forward="/WEB-INF/done.jsp";}else {
				forward="/WEB-INF/ModifierPassword.jsp";
			}
			
		}else if(action.equalsIgnoreCase("changeinfo"))  {
			
			String nom = request.getParameter("lastname");
			String prenom = request.getParameter("firstname");
			String telephone = request.getParameter("telephone");
			String date_naissance = request.getParameter("date");
			String adresse_utilisateur = request.getParameter("adress");
			String cin = request.getParameter("cin");
			String num_permis = request.getParameter("num_permis");
			User user1=new User();
			try {
				user1=userdao.findSpecificUserByEmail((String) session.getAttribute("user"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String photo = ""/* request.getParameter("photo") */;

			User user = new User(user1.getId_user(), nom, prenom, telephone, date_naissance, adresse_utilisateur, "", user1.getEmail(), "",
					cin, num_permis, photo);
			try {
				userdao.UpdateUser(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			forward="/WEB-INF/done.jsp";
		}
		}else {
			forward="/WEB-INF/login.jsp";
		}
		
		
		request.getRequestDispatcher(forward).forward(request, response);

	}
	
}
