import java.util.HashSet;

public class Firma {

	String numeFirma;

	private HashSet<Angajati> members;

	public boolean angajeaza(Angajati m) {
		return Angajati.add(m);
	}

	public double salarMediu() {
		double salarMediu = 0;
		for (Angajati m : members) {
			salarMediu += m.calculSalar();
		}
		return salarMediu;
	}

	public Firma(String numeFirma) {
		this.numeFirma = numeFirma;
	}
}
