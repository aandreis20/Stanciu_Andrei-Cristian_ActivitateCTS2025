package models;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbs{

    private List<StructuraAbs> subdepartamente;

    public Departament(String nume, int numarAngajati) {
        super(nume, numarAngajati);
        this.subdepartamente = new ArrayList<>();
    }


    @Override
    public void adaugaNod(StructuraAbs s) {
        subdepartamente.add(s);
    }

    @Override
    public void stergeNod(StructuraAbs s) {
        subdepartamente.remove(s);

    }

    @Override
    public StructuraAbs getNodCopil(int index) {
        return subdepartamente.get(index);
    }

    @Override
    public void afiseazaDescriere(String tab) {
        System.out.println(tab + "Departamentul " + this.getNume() + " contine urmatoarele subdepartamente / sectii: " );
        for(StructuraAbs str:subdepartamente){
            str.afiseazaDescriere(tab+"   ");
        }
    }

    @Override
    public int calculeazaNrAngajati() {
        int sum=0;
        for (StructuraAbs structuraAbs : subdepartamente)
        {
            sum+=structuraAbs.calculeazaNrAngajati();
        }
        return sum + this.getNumarAngajati();
    }
}
