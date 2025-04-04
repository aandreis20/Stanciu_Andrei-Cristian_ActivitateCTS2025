package main;

import clase.AdapterMedicament;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main {

    static void vindeMedicament(MedicamentFarmacie medicament) {
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Medicament1", 10, 10, "20 aprilie");

        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital(30, "Medicament2");
        AdapterMedicament adapterMedicament = new AdapterMedicament(medicamentSpital);
        vindeMedicament(adapterMedicament);
    }
}