package main;

import factory.Bucatarie;
import factory.TipSupa;
import models.Supa;

public class Main {
    public static void main(String[] args) {

        Bucatarie bucatarie = new Bucatarie(250, 25.5f);

        Supa supaLegume = bucatarie.getSupa(TipSupa.LEGUME,true,false);
        Supa supaCiuperci = bucatarie.getSupa(TipSupa.CIUPERCI,false,true);
        Supa supaVita = bucatarie.getSupa(TipSupa.VITA,true,true);

        supaLegume.afiseazaDescriere();
        supaCiuperci.afiseazaDescriere();
        supaVita.afiseazaDescriere();

        System.out.println(" ");

        Bucatarie cantina = new Bucatarie(500, 10.5f);

        Supa supaLegumeCantina = cantina.getSupa(TipSupa.LEGUME,true,false);
        Supa supaCiuperciCantina = cantina.getSupa(TipSupa.CIUPERCI,false,true);
        Supa supaVitaCantina = cantina.getSupa(TipSupa.VITA,true,true);

        supaLegumeCantina.afiseazaDescriere();
        supaCiuperciCantina.afiseazaDescriere();
        supaVitaCantina.afiseazaDescriere();

        System.out.println(" ");
    }
}