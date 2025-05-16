package clase;

public class InfoTroleibuz extends AInfoTransport{
    @Override
    public void recomandaTransport(int distanta) {
        if (distanta<3)
        {
            System.out.println("Va recomandam sa luati troleibuzul");
        }
        else
        {
            super.getNext().recomandaTransport(distanta);
        }
    }
}