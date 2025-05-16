package clase;

public class InfoTramvai extends AInfoTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if (distanta<10)
        {
            System.out.println("Va recomandam sa luati tramvaiul");
        }
        else
        {
            super.getNext().recomandaTransport(distanta);
        }
    }
}