package clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public Angajat() {}

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat: Nume=" +
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
                "Ocupatie=" +
                ocupatie +
                ", salariu=" +
                salariu;
    }
}