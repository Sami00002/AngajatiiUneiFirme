import java.util.HashSet;

public class Firma extends Angajati {

	private HashSet<Angajati> members;
	private String numeiFirma;

	public Firma(String name, String numeiFirma) {
		super(name);
		this.numeiFirma = numeiFirma;
		members = new HashSet<Angajati>();
		members.add(name);
	}

	public boolean addMember(Angajati m) {
		return members.add(m);
		return true;
	}

	private double salariuMediu() {
		return 0;
	}

}
