package driver;

import java.util.Scanner;
import model.Model1;

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String kode = input.nextLine();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            double berat = input.nextDouble();
            input.nextLine(); // buang enter

            Model1 m = new Model1(kode, berat);
            m.cetakStruk();
        }

        input.close();
    }
}