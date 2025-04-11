package models;

public class NotaDePlataRevelion extends Felicitare{

    public NotaDePlataRevelion (NotaDePlata notaDePlata) {
        super(notaDePlata);
    }
    @Override
    protected void printareFelicitare() {
        System.out.println("La Multi Ani!");
    }
}
