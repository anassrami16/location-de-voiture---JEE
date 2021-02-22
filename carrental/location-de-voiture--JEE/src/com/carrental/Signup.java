package com.carrental;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moduls.User;
import com.dao.implementations.UserDaoImp;
import com.dao.interfaces.*;




/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	HttpSession session;
	String forward = "";
	String action="";
	UserDaoImp userdaoimp=new UserDaoImp();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/signup.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		action=request.getParameter("action");
		String  nom=request.getParameter("lastname");
		String  prenom=request.getParameter("firstname");
		String  telephone=""/*request.getParameter("telephone")*/;
		String  date_naissance=request.getParameter("date");
		String  adresse_utilisateur=request.getParameter("adress");
		String  login=""/*request.getParameter("login")*/;
		String  email=request.getParameter("email");
		String  password=request.getParameter("pass");
		String  cin=""/*request.getParameter("cin")*/;
		String  num_permis=""/*request.getParameter("num_permis")*/;
		String  photo=""/*request.getParameter("photo")*/;
		User user=new User(0, nom, prenom, telephone, date_naissance, adresse_utilisateur, login, email, password, cin, num_permis, photo);

			try {
				userdaoimp.insertUser(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("/WEB-INF/done.jsp").forward(request, response);


	}

}
