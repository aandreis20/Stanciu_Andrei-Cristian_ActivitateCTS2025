package clase;

public class MedicamentFarmacie {
    private String name;
    private int price;
    private int stoc;
    private String dataExpirare;

    public MedicamentFarmacie(String name, int price, int stoc, String dataExpirare) {
        this.name = name;
        this.price = price;
        this.stoc = stoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul " + name + " costa " + price + " lei si expira la " + dataExpirare + " are stocul" + stoc);
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

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }
}
