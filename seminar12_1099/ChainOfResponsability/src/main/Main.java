package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        AInfoTransport troleibuz = new InfoTroleibuz();
        AInfoTransport autobuz = new InfoAutobuz();
        AInfoTransport tramvai = new InfoTramvai();
        AInfoTransport metrou = new InfoMetrou();

        troleibuz.setNext(autobuz);
        troleibuz.setNext(tramvai);
        troleibuz.setNext(metrou);

        troleibuz.recomandaTransport(1);
        troleibuz.recomandaTransport(2);
        troleibuz.recomandaTransport(5);
        troleibuz.recomandaTransport(7);

    }
}