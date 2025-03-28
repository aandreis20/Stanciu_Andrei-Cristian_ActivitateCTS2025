package clase;

public class RezervareBuilder implements IBuilder {
    private String numeClient;
    private Boolean asezareGeam;
    private Boolean scuaneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.scuaneErgonomice = false;
        this.decorareMasa = false;
        this.genMuzica = "fara muzica";
    }


    @Override
    public Rezervare buildRezervare(String numeClient) {
        return new Rezervare(numeClient, this.asezareGeam, this.scuaneErgonomice, this.decorareMasa, this.genMuzica);
    }

    @Override
    public IBuilder setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    @Override
    public IBuilder setScuaneErgonomice(Boolean scuaneErgonomice) {
        this.scuaneErgonomice = scuaneErgonomice;
        return this;
    }

    @Override
    public IBuilder setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
