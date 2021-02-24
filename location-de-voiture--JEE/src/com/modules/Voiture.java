package com.modules;

public class Voiture {

	private int id_vehicule;
	private String marque;
	private String modele;
	private String CARBURANT;
	private int KILOMETRAGE;
	private String IMMATRICULATION;
	private String TYPE_VRHICULE;
	private String PHOTO1;
	private String PHOTO2;
	private String boite_vitesse;
	private int nbr_places;
	private int nbr_portes;
	private int id_user;
	public int getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(int id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCARBURANT() {
		return CARBURANT;
	}
	public void setCARBURANT(String cARBURANT) {
		CARBURANT = cARBURANT;
	}
	public int getKILOMETRAGE() {
		return KILOMETRAGE;
	}
	public void setKILOMETRAGE(int kILOMETRAGE) {
		KILOMETRAGE = kILOMETRAGE;
	}
	public String getIMMATRICULATION() {
		return IMMATRICULATION;
	}
	public void setIMMATRICULATION(String iMMATRICULATION) {
		IMMATRICULATION = iMMATRICULATION;
	}
	public String getTYPE_VRHICULE() {
		return TYPE_VRHICULE;
	}
	public void setTYPE_VRHICULE(String tYPE_VRHICULE) {
		TYPE_VRHICULE = tYPE_VRHICULE;
	}
	public String getPHOTO1() {
		return PHOTO1;
	}
	public void setPHOTO1(String pHOTO1) {
		PHOTO1 = pHOTO1;
	}
	public String getPHOTO2() {
		return PHOTO2;
	}
	public void setPHOTO2(String pHOTO2) {
		PHOTO2 = pHOTO2;
	}
	public String getBoite_vitesse() {
		return boite_vitesse;
	}
	public void setBoite_vitesse(String boite_vitesse) {
		this.boite_vitesse = boite_vitesse;
	}
	public int getNbr_places() {
		return nbr_places;
	}
	public void setNbr_places(int nbr_places) {
		this.nbr_places = nbr_places;
	}
	public int getNbr_portes() {
		return nbr_portes;
	}
	public void setNbr_portes(int nbr_portes) {
		this.nbr_portes = nbr_portes;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public Voiture() {
		super();
	}
	public Voiture(int id_vehicule, String marque, String modele, String cARBURANT, int kILOMETRAGE,
			String iMMATRICULATION, String tYPE_VRHICULE, String pHOTO1, String pHOTO2, String boite_vitesse,
			int nbr_places, int nbr_portes, int id_user) {
		super();
		this.id_vehicule = id_vehicule;
		this.marque = marque;
		this.modele = modele;
		CARBURANT = cARBURANT;
		KILOMETRAGE = kILOMETRAGE;
		IMMATRICULATION = iMMATRICULATION;
		TYPE_VRHICULE = tYPE_VRHICULE;
		PHOTO1 = pHOTO1;
		PHOTO2 = pHOTO2;
		this.boite_vitesse = boite_vitesse;
		this.nbr_places = nbr_places;
		this.nbr_portes = nbr_portes;
		this.id_user = id_user;
	}
	
	
	

}
