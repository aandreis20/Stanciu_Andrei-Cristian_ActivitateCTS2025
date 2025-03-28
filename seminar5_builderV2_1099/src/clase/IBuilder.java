package clase;

public interface IBuilder {
    Rezervare buildRezervare(String numeClient);

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScuaneErgonomice(Boolean scuaneErgonomice);
    IBuilder setDecorareMasa(Boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);
}
