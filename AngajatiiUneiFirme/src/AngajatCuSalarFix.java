import java.util.HashSet;

public class AngajatCuSalarFix extends Angajati {

	private double salariuFix;
	private double salariuSchimbat;
	private HashSet<Angajati> salariu;

	public AngajatCuSalarFix(String name, double salariuFix) {
		super(name);
		this.salariuFix = salariuFix;
		salariu = new HashSet<Angajati>();
		salariu.add(salariuFix);
	}

	public double calculSalar() {
		return salariuFix;
	}

	public void setSalariuFix(double salariuFix) {
		this.salariuFix = salariuFix;
	}

	public double getSalariuSchimbat() {
		return salariuSchimbat;
	}

	public double schimbaSalarFix() {
		return salariuFix = getSalariuSchimbat();
	}

	public boolean addSalariu(Angajati m) {
		return salariu.add(m);
	}
}
