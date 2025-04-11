package models;

public abstract class Felicitare implements Nota{
    private NotaDePlata notaDePlata;

    public Felicitare(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
