package main;

import clase.Tramvai;
import clase.TramvaiAbs;
import clase.TramvaiTemporar;

public class Main {
    public static void main(String[] args) {

        TramvaiAbs tramvai = new Tramvai(41);

        System.out.println();
        tramvai.parcurgeTur();

        System.out.println();
        tramvai.parcurgeRetur();

        TramvaiAbs tramvai2 = new TramvaiTemporar(42);

        System.out.println();
        tramvai2.parcurgeTur();

        System.out.println();
        tramvai2.parcurgeRetur();

    }
}