package domaine;

import exception.NomException;

/**
 * Cette classe est une representation de Employe
 * 
 * @author devlopix
 *
 */
public class Employe {

	/*
	 * Les propriétés
	 */
	private String nom;
	private String prenom;
	private int id;
	static protected int nbrEmploye = 20;

	/*
	 * Getters et Setters
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employe() {

	}

	public Employe(String nom, String prenom, int id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	/*
	 * méthodes métier
	 */
	public void demanderFormation(String theme) {
		System.out.println("demander formation Employe " + theme);
	}

	/**
	 * @return retourne la representation String de l'objet Emplye
	 */

	public void testDebug(String nom) {
		this.setNom(nom);
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}

}
