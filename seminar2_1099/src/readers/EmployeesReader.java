package readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeesReader extends BaseReader {
    public EmployeesReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            citireAplicant(input2, angajat);
            angajat.setSalariu(input2.nextInt());
            angajat.setOcupatie(input2.next());
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
