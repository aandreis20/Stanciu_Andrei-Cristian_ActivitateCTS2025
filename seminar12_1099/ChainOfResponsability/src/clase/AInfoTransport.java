package clase;

public abstract class AInfoTransport {
    private AInfoTransport next;

    public void setNext(AInfoTransport next) {
        this.next = next;
    }

    protected AInfoTransport getNext() {
        return next;
    }

    public abstract void recomandaTransport(int distanta);
}