package main;

import clase.Aplicant;
import readers.BaseReader;
import readers.EmployeesReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		BaseReader baseReader = new EmployeesReader("seminar2_1099/angajati.txt");
		try {
			listaAplicanti = baseReader.readAplicants();
			for(Aplicant angajat:listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
