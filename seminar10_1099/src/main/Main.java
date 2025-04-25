package main;

import models.Departament;
import models.Sectie;
import models.StructuraAbs;

public class Main {
    public static void main(String[] args) {
        StructuraAbs d1 = new Departament("Chirurgie",10);
        StructuraAbs d2 = new Departament("Pediatrie",20);
        StructuraAbs d3 = new Departament("Dermatologie",15);

        StructuraAbs s1 = new Sectie("chirurgie estetica", 25);
        StructuraAbs s2 = new Sectie("chirurgie neuronala", 9);
        StructuraAbs s3 = new Sectie("imagistica", 12);

        d1.adaugaNod(d2);
        d1.adaugaNod(s1);
        d1.adaugaNod(s2);
        d2.adaugaNod(s3);

        System.out.println(d1.calculeazaNrAngajati());
        System.out.println("-----------------------");
        System.out.println(d2.calculeazaNrAngajati());
        System.out.println("-----------------------");
        d1.afiseazaDescriere("");
    }
}