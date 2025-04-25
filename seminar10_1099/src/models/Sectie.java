package models;

public class Sectie extends StructuraAbs{

    public Sectie(String nume, int numeAngajati) {
        super(nume, numeAngajati);
    }

    @Override
    public void adaugaNod(StructuraAbs s) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void stergeNod(StructuraAbs s) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void afiseazaDescriere(String tab) {
        System.out.println(tab + "Sectia " + this.getNume());

    }

    @Override
    public int calculeazaNrAngajati() {
        return this.getNumarAngajati();
    }
}
