package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	
	public Student(String nume,
				   String prenume,
				   int varsta,
				   int punctaj,
				   int nr_proiecte,
				   String[] denumireProiect,
				   String facultate,
				   int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		return "Student: Nume=" + getNume() +
				", Prenume=" + getPrenume() +
				", Varsta=" + getVarsta() +
				", Punctaj=" + getPunctaj() +
				", Nr_proiecte=" + getNrProiecte() +
				", DenumireProiect=" + Arrays.toString(getDenumireProiect()) +
				"Facultate=" +
				facultate +
				", An_studii=" +
				an_studii ;
	}
}
