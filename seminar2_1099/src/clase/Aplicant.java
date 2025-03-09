package clase;

public abstract class Aplicant {
	private String nume;
	private String prenume;
	private int varsta;
	private int punctaj;
	private int nrProiecte;
	private String[] denumireProiect;

	public String[] getDenumireProiect() {
		return denumireProiect;
	}

	private int punctajMinim = 80;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}

	public Aplicant(String nume,
					String prenume,
					int varsta,
					int punctaj,
					int nrProiecte,
					String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNrProiecte() {
		return nrProiecte;
	}
	public void setNrProiecte(int nrProiecte, String[] denumiriProiecte) {
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumiriProiecte;
	}
}
