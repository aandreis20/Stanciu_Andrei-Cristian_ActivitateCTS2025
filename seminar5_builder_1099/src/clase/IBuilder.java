package clase;

public interface IBuilder {
    Rezervare buildRezervare();

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScuaneErgonomice(Boolean scuaneErgonomice);
    IBuilder setDecorareMasa(Boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);
    IBuilder setNumeClient(String numeClient);
}
