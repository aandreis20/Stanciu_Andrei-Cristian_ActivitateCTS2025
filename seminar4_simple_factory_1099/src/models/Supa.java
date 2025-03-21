package models;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private Boolean hasArdei;
    private Boolean hasSmantana;

    public Supa(int cantitate, float pret, Boolean hasArdei, Boolean hasSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.hasArdei = hasArdei;
        this.hasSmantana = hasSmantana;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public abstract void afiseazaDescriere();

    public abstract float calculeazaPretFinal();
}
