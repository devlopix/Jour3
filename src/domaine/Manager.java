package domaine;

/**
 * 
 * @author devlopix
 *
 */
public class Manager extends Employe {

	private String mobilite;

	public String getMobilite() {
		return mobilite;
	}
// comment monologne
	/*
	 * comment multi ligne
	 */

	public void setMobilite(String mobilite) {
		this.mobilite = mobilite;
	}

	public Manager(String nom, String prenom, int id, String mobilite) {
		super(nom, prenom, id);
		this.mobilite = mobilite;
	}

	@Override
	public void demanderFormation(String theme) {
		System.out.println("demande formation Manager " + theme);

	}

//	@Override
//	public String toString() {
//		return "Manager [mobilite=" + mobilite + "]" + " " + super.toString();
//	}

}
