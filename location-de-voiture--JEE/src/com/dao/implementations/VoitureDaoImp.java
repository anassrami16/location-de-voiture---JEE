package com.dao.implementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Servelet.Voiture;
import com.dao.ConnectionFactory.ConnectionFactory;
import com.dao.interfaces.VoitureDao;

public class VoitureDaoImp  implements VoitureDao{


	Connection connection;
	@Override
	public int getMax() {

		ResultSet rs = null;
		String query = "SELECT count(*) FROM vehicule";
		int max = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = ConnectionFactory.getConnection();
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			max = rs.getInt(1);
			rs.close();

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
	public int insertVoiture(Voiture voiture) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int UpdateVoiture(Voiture voiture) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Voiture findSpecificVoitureByid(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void DeleteVoiture(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
