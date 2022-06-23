
public class AngajatCuOra extends Angajati {

	private int adaugaOre;
	private double salariuPeOra;
	private int numarDeOraLucrateInPlus;
	private int salariuSchimbat;

	public AngajatCuOra(String name, int adaugaOre, double salariuPeOra) {
		super(name);
		this.adaugaOre = adaugaOre;
		this.salariuPeOra = salariuPeOra;
	}

	public int getNumarDeOre() {
		return adaugaOre;
	}

	public void setNumarDeOre(int numarDeOre) {
		this.adaugaOre = numarDeOre;
	}

	public double getSalariuPeOra() {
		return salariuPeOra;
	}

	public void setSalariuPeOra(double salariuPeOra) {
		this.salariuPeOra = salariuPeOra;
	}

	salariuPeOra

	public int getSalariuSchimbat() {
		return salariuSchimbat;
	}

	private int adaugaOre() {
		return numarDeOraLucrateInPlus = getNumarDeOraLucrateInPlus();
	}

	private double schimbaSalarPeOra() {
		return salariuSchimbat = getSalariuSchimbat();
	}

	private double valculSalar() {
		return (salariuPeOra + numarDeOraLucrateInPlus) * salariuPeOra;
	}

	public boolean addSalariu(Angajati m) {
		return salariu.add(m);
	}
}
