package exception;

public class NomException extends Exception {

	String nom;

	public NomException() {
	}

	public NomException(String nom) {
		this.nom = nom;
	}

	@Override
	public String getMessage() {
		return "Le nom :" + this.nom + " est d'une longeur de moins de 3 caractères";
	}
}
