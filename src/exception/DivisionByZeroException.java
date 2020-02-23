package exception;

public class DivisionByZeroException extends Exception {

	private double numerateur;
	private double denominateur;

	public double getNumerateur() {
		return numerateur;
	}

	public void setNumerateur(double numerateur) {
		this.numerateur = numerateur;
	}

	public double getDenominateur() {
		return denominateur;
	}

	public void setDenominateur(double denominateur) {
		this.denominateur = denominateur;
	}

	public DivisionByZeroException() {
	}

	public DivisionByZeroException(double numerateur, double denominateur) {
		super();
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}

	@Override
	public String getMessage() {
		return "Opération de division de " + this.numerateur 
				+ "/" + this.denominateur + " non réussi";
	}

}
