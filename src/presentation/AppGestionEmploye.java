package presentation;


import java.util.ArrayList;
import java.util.Scanner;

import domaine.Employe;

public class AppGestionEmploye {
	static Scanner scan = new Scanner(System.in);
	
	ArrayList<Employe> emps = new ArrayList<Employe>();

	public static void main(String[] args) {
		// Init des variables

		// Employe[] emp = new Employe[30];
		
		int choixUtilisateur = 0;

		// debut de la boucle while
		while (choixUtilisateur != 4) {
			// afficher menu
			choixUtilisateur = afficherMenu();
			// agir selon choix utilisateur
			switch (choixUtilisateur) {
			case 1:
				ajouterEmploye();
				break;
			case 2:
				supprimerEmploye();
				break;

			default:
				break;
			}

		} // fin boucle while

		System.out.println("Programme est terminé !");
	}

	static int afficherMenu() {
		System.out.println("1 - ajouter ");
		System.out.println("2 - supprimer ");
		System.out.println("3 - lister ");
		System.out.println("4 - Quitter  ");
		int choix = scan.nextInt();
		return choix;
	}

	static void ajouterEmploye() {
		// TODO ajouter employe
	}

	static void supprimerEmploye() {
		// TODO ajouter le code de suppression des employés
	}
}
