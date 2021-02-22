package com.dao.implementations;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.dao.interfaces.UserDao;
import com.moduls.User;

public class UserDaoImp implements UserDao {

	String url = "jdbc:mysql://localhost:3306/location?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String user = "root";
	String password = "root";

	int getMax() {
		Connection con = null;
		ResultSet rs = null;
		String query = "SELECT count(*) FROM utilisateur";
		int max = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(this.url, this.user, this.password);
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			max = rs.getInt(1);
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return max;
	}

	@Override
	public Boolean findSpecificByEmail(String email) throws SQLException {
		Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con = DriverManager.getConnection(this.url, this.user, this.password);
		PreparedStatement preparedStmt = null;

		String query = "SELECT count(*) FROM utilisateur where email=?";
		preparedStmt = con.prepareStatement(query);
		preparedStmt.setString(1, email);
		rs = preparedStmt.executeQuery();
		rs.next();
		int i = rs.getInt(1);
		return i == 1;

	}

	@Override
	public User findSpecificUserByEmail(String email) throws SQLException {
		Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		con = DriverManager.getConnection(this.url, this.user, this.password);
		PreparedStatement preparedStmt = null;

		String query = "SELECT id_user,nom,prenom,telephone,DATE_NAISSANCE,ADRESSE_UTILISATEUR,LOGIN,EMAIL,PASSWORD,"
				+ "CIN,NUM_PERMIS,PHOTO FROM utilisateur where email=?";
		preparedStmt = con.prepareStatement(query);
		preparedStmt.setString(1, email);
		rs = preparedStmt.executeQuery();
		rs.next();
		int id_user=rs.getInt("id_user");
		String nom=rs.getString("nom");
		String prenom=rs.getString("prenom");
		String telephone=rs.getString("telephone");
		String date_naissance=rs.getString("DATE_NAISSANCE");
		String adresse_utilisateur=rs.getString("ADRESSE_UTILISATEUR");
		String login=rs.getString("LOGIN");
		String password=rs.getString("PASSWORD");		
		String cin=rs.getString("CIN");
		String num_permis=rs.getString("NUM_PERMIS");
		String photo=rs.getString("PHOTO");
		User user = new User(id_user, nom, prenom, telephone, date_naissance, adresse_utilisateur, login, email, password, cin, num_permis, photo);
		return user;

	}

	@Override
	public int insertUser(User user) throws SQLException {
		Connection con1 = null;
		PreparedStatement preparedStmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con1 = DriverManager.getConnection(this.url, this.user, this.password);
		String query = "INSERT INTO utilisateur (id_user,nom,prenom,telephone,ADRESSE_UTILISATEUR,"
				+ "LOGIN,EMAIL,PASSWORD,CIN,NUM_PERMIS,PHOTO) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		preparedStmt = con1.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		preparedStmt.setInt(1, getMax() + 1);
		preparedStmt.setString(2, user.getNom());
		preparedStmt.setString(3, user.getPrenom());
		preparedStmt.setString(4, user.getTelephone());

		preparedStmt.setString(5, user.getAdresse_utilisateur());
//		preparedStmt.setString(6, user.getAdresse_utilisateur());
		preparedStmt.setString(6, user.getLogin());
		preparedStmt.setString(7, user.getEmail());
		preparedStmt.setString(8, user.getPassword());
		preparedStmt.setString(9, user.getCin());
		preparedStmt.setString(10, user.getNum_permis());
		preparedStmt.setString(11, user.getPhoto());
		preparedStmt.execute();

		return 0;

	}

	@Override
	public int UpdateUser(User user) throws SQLException {
		Connection con1 = null;
		PreparedStatement preparedStmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con1 = DriverManager.getConnection(this.url, this.user, this.password);
		String query = "UPDATE  utilisateur set(id_user=?,nom=?,prenom=?,telephone=?,DATE_NAISSANCE=?,ADRESSE_UTILISATEUR=?,"
				+ "LOGIN=?,EMAIL=?,PASSWORD=?,CIN=?,NUM_PERMIS=?,PHOTO=?) " + "WHERE id_user=" + user.getId_user()
				+ "and email=" + user.getEmail();
		preparedStmt = con1.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		preparedStmt.setInt(1, getMax() + 1);
		preparedStmt.setString(2, user.getNom());
		preparedStmt.setString(3, user.getPrenom());
		preparedStmt.setString(4, user.getTelephone());
		preparedStmt.setString(5, user.getDate_naissance());
		preparedStmt.setString(6, user.getAdresse_utilisateur());
		preparedStmt.setString(7, user.getLogin());
		preparedStmt.setString(8, user.getEmail());
		preparedStmt.setString(9, user.getPassword());
		preparedStmt.setString(10, user.getCin());
		preparedStmt.setString(11, user.getNum_permis());
		preparedStmt.setString(12, user.getPhoto());
		preparedStmt.execute();

		return 0;

	}
	@Override
	public void DeleteUser(String email) {
		Connection con1 = null;
		PreparedStatement preparedStmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con1 = DriverManager.getConnection(this.url, this.user, this.password);
			String query = "DELETE FROM utilisateur WHERE email=" + email;
			preparedStmt = con1.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			preparedStmt.execute();
			preparedStmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
