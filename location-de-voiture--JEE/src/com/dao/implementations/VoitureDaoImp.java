package com.dao.implementations;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import com.dao.ConnectionFactory.ConnectionFactory;
import com.dao.interfaces.VoitureDao;
import com.modules.Voiture;

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
		PreparedStatement preparedStmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection = ConnectionFactory.getConnection();
		String query = "INSERT INTO vehicule (id_vehicule,marque,modele,CARBURANT,KILOMETRAGE,IMMATRICULATION,type_vehicule,"
				+ "PHOTO1,PHOTO2,boite_vitesse,nbr_places,nbr_portes,id_user,fin,debut,descr,lieu_rencontre,prix,ville) " 
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		preparedStmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		preparedStmt.setInt(1, getMax() + 1);
		preparedStmt.setString(2, voiture.getMarque());
		preparedStmt.setString(3, voiture.getModele());
		preparedStmt.setString(4, voiture.getCARBURANT());
		preparedStmt.setInt(5, voiture.getKILOMETRAGE());
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		 java.util.Date date=new java.util.Date();
		try {
			date = sdf.parse(voiture.getFin());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		preparedStmt.setString(6, voiture.getIMMATRICULATION());
		preparedStmt.setString(7, "");
		preparedStmt.setString(8, voiture.getPHOTO1());
		preparedStmt.setString(9, voiture.getPHOTO2());
		preparedStmt.setString(10, voiture.getBoite_vitesse());
		preparedStmt.setInt(11, voiture.getNbr_places());
		preparedStmt.setInt(12, voiture.getNbr_portes());
		preparedStmt.setInt(13, voiture.getId_user());
		java.sql.Date sqlDate = new Date(date.getTime());
		preparedStmt.setDate(14, sqlDate);
		try {
			date = sdf.parse(voiture.getDebut());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlDate = new Date(date.getTime());

		preparedStmt.setDate(15,sqlDate);
		preparedStmt.setString(16, voiture.getDescr());
		preparedStmt.setString(17, voiture.getLieu_rencontre());
		preparedStmt.setInt(18, voiture.getPrix());
		preparedStmt.setString(19, voiture.getVille());


		preparedStmt.execute();

		return 0;

	}
	@Override
	public int UpdateVoiture(Voiture voiture) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public Voiture findSpecificVoitureByid(int id) throws SQLException {
		connection = ConnectionFactory.getConnection();
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		connection = ConnectionFactory.getConnection();
		PreparedStatement preparedStmt = null;

		String query = "SELECT (id_vehicule,marque,modele,CARBURANT,KILOMETRAGE,IMMATRICULATION,TYPE_VRHICULE," + 
				"+PHOTO1,PHOTO2,boite_vitesse,nbr_places,nbr_portes"
				+ ",id_user,fin,debut,descr,lieu_rencontre,prix,ville) FROM vehicule where id_vehicule=?";
		preparedStmt.setInt(1, id);
		preparedStmt = connection.prepareStatement(query);
		rs = preparedStmt.executeQuery();
		rs.next();
		int id_vehicule = rs.getInt("id_vehicule");
		String marque = rs.getString("marque");
		String modele = rs.getString("modele");
		String CARBURANT = rs.getString("CARBURANT");
		int KILOMETRAGE = rs.getInt("KILOMETRAGE");
		java.sql.Date date = rs.getDate("fin");
		Date date1 = (Date) date ;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String fin = formatter.format(date1);
        date = rs.getDate("debut");
        Date date2=(Date) date ;
        String debut=formatter.format(date2);
		String IMMATRICULATION = rs.getString("IMMATRICULATION");
		String TYPE_VRHICULE = rs.getString("TYPE_VRHICULE");
		String PHOTO1 = rs.getString("PHOTO1");
		String PHOTO2 = rs.getString("PHOTO2");
		String boite_vitesse = rs.getString("boite_vitesse");
		int nbr_places = rs.getInt("nbr_places");
		int nbr_portes = rs.getInt("nbr_portes");
		int id_user = rs.getInt("id_user");
		int prix = rs.getInt("prix");
		String ville = rs.getString("ville");
		String descr = rs.getString("descr");
		String lieu_rencontre = rs.getString("lieu_rencontre");

		Voiture voiture=new Voiture(id_vehicule, marque, modele, CARBURANT, KILOMETRAGE, IMMATRICULATION, TYPE_VRHICULE, PHOTO1,
		PHOTO2, boite_vitesse, nbr_places, nbr_portes, id_user, fin, debut, prix, descr, lieu_rencontre, ville);
		
		return voiture;
	}
	
	
	@Override
	public void DeleteVoiture(int id) throws SQLException {
		// TODO Auto-generated method stub
		}
		
	

	@Override
	public List<Voiture> findSpecificVoitureByEmail(int email) throws SQLException {
		return null;}

}
