package models;

public abstract class StructuraAbs {
    private String nume;
    private int numarAngajati;

    public StructuraAbs(String nume, int  numeAngajati) {
        this.nume = nume;
        this.numarAngajati = numeAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int  getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int  numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public abstract void adaugaNod(StructuraAbs s);
    public abstract void stergeNod(StructuraAbs s);
    public abstract StructuraAbs getNodCopil (int index);
    public abstract void afiseazaDescriere(String tab);
    public abstract int calculeazaNrAngajati();
}
