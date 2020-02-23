package presentation;

import java.util.Scanner;

import domaine.Employe;
import domaine.Manager;
import exception.DivisionByZeroException;
import exception.NomException;

/**
 * 
 * @author devlopix
 *
 */
public class MonApp {

	public static void main(String[] args) {
		double resultat;
		try {
			resultat = calculerDivision();
			System.out.println(resultat);
		} catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
		}

	}

	static double calculerDivision() throws DivisionByZeroException {
		Scanner scan = new Scanner(System.in);
		System.out.println("nombre1 : ");
		double a = scan.nextDouble();
		System.out.println("nombre2 : ");
		double b = scan.nextDouble();

		if (b == 0) {
			throw new DivisionByZeroException(a, b);
		} else {
			return a / b;
		}

	}

}
