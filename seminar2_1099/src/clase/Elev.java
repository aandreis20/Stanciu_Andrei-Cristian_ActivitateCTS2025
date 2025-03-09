package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;

	@Override
	public String toString() {
		return "Elev: Nume=" +
				getNume() +
				", Prenume=" +
				getPrenume() +
				", Varsta=" +
				getVarsta() +
				", Punctaj=" +
				getPunctaj() +
				", Nr_proiecte=" +
				getNrProiecte() +
				", DenumireProiect=" +
				Arrays.toString(getDenumireProiect()) +
				"Clasa=" +
				clasa +
				", Tutore=" +
				tutore;
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
}
