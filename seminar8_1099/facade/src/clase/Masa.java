package clase;

public class Masa {
    private boolean esteLibera;
    private int numarulMasa;
    private int numarPersoane;

    public Masa(boolean esteLibera, int numarulMasa, int numarPersoane) {
        this.esteLibera = esteLibera;
        this.numarulMasa = numarulMasa;
        this.numarPersoane = numarPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNumarMasa() {
        return numarulMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }
}
