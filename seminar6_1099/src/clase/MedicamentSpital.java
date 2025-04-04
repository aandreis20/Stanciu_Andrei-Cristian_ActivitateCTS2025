package clase;

public class MedicamentSpital {
    private String name;
    private int price;

    public MedicamentSpital(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicament: " + name + ", Price: " + price);
    }

    private void prezintaReteta() {
        System.out.println("Prezinta reteta " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
