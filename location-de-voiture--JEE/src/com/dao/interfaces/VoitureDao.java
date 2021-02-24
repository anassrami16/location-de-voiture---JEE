package com.dao.interfaces;

import java.sql.SQLException;

import com.Servelet.Voiture;

public interface VoitureDao {

	public int insertVoiture(Voiture voiture) throws SQLException;

	public int UpdateVoiture(Voiture voiture) throws SQLException;

	public Voiture findSpecificVoitureByid(int id) throws SQLException;

	public void DeleteVoiture(int id) throws SQLException;

	public int getMax() throws SQLException;
}
