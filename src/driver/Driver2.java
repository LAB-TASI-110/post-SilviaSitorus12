package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model2 gudang = new Model2();

        // Input jumlah data (formalitas sesuai soal)
        System.out.print("Masukkan jumlah data (N): ");
        int N = input.nextInt();
        input.nextLine(); // clear buffer

        // Input deret stok (tidak digunakan)
        System.out.print("Masukkan deret stok: ");
        String deret = input.nextLine();

        // Input kode barang
        System.out.print("Masukkan kode barang: ");
        String kode = input.nextLine().toUpperCase();

        // Ambil stok
        int totalStok = gudang.getStokByKode(kode);

        // Output
        if (totalStok > 0) {
            System.out.println("Total stok untuk " + kode + " = " + totalStok);
        } else {
            System.out.println("Kode barang tidak ditemukan.");
        }

        input.close();
    }
}