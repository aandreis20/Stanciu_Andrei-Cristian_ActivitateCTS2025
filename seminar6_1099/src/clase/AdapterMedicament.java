package clase;

public class AdapterMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getName(), medicamentSpital.getPrice(), 20, "13 aprilie");
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
