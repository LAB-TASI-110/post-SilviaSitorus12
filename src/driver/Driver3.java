package driver;

import java.util.Scanner;
import model.Model3;
import model.Model3.Customer;
import model.Model3.Menu;
import model.Model3.Order;

public class Driver3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ================= INPUT CUSTOMER =================
        System.out.print("Nama: ");
        String name = input.nextLine();

        System.out.print("Role (Dosen/Staff/Mahasiswa): ");
        String role = input.nextLine();

        Customer customer = new Customer(name, role);
        Order order = new Order();

        // ================= TAMPILKAN MENU =================
        Menu[] menuList = Model3.getMenuList();

        System.out.println("\n=== MENU KAFETARIA IT DEL ===");
        for (int i = 0; i < menuList.length; i++) {
            System.out.println((i + 1) + ". " +
                menuList[i].getName() + " - " +
                menuList[i].getPrice());
        }

        // ================= INPUT PESANAN =================
        System.out.print("\nJumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Pilih menu ke-" + (i + 1) + ": ");
            int pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= menuList.length) {
                order.addItem(menuList[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak valid!");
                i--; // ulang input
            }
        }

        // ================= OUTPUT =================
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Nama      : " + customer.getName());
        System.out.println("Role      : " + customer.getRole());
        System.out.println("Pesanan   : " + order.getItemsAsString());
        System.out.println("Total     : " + order.getTotal());
        System.out.println("Diskon    : " + order.getDiscount());
        System.out.println("Bayar     : " + order.getFinalTotal());
        System.out.println("\nSelamat Menikmati!");

        input.close();
    }
}