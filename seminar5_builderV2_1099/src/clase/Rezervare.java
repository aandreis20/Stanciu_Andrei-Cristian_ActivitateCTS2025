package clase;

public class Rezervare {
    private String numeClient;
    private Boolean asezareGeam;
    private Boolean scuaneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;

    protected Rezervare(String numeClient, Boolean asezareGeam, Boolean scuaneErgonomice, Boolean decorareMasa, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareGeam = asezareGeam;
        this.scuaneErgonomice = scuaneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scuaneErgonomice=").append(scuaneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
