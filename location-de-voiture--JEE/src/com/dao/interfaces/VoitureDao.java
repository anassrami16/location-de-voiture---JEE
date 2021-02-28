package com.dao.interfaces;

import java.sql.SQLException;
import java.util.List;
import com.modules.*;

public interface VoitureDao {

	public int UpdateVoiture(Voiture voiture) throws SQLException;

	public Voiture findSpecificVoitureByid(int id) throws SQLException;

	public void DeleteVoiture(int id) throws SQLException;

	public int getMax() throws SQLException;

	public List<Voiture> findSpecificVoitureByEmail(int email) throws SQLException;

	int insertVoiture(Voiture voiture) throws SQLException;

}
