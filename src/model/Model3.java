package model;

import java.util.ArrayList;
import java.util.List;

public class Model3 {

    // ================= MENU =================
    public static class Menu {
        private String name;
        private int price;

        public Menu(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    // ================= CUSTOMER =================
    public static class Customer {
        private String name;
        private String role;

        public Customer(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }
    }

    // ================= ORDER =================
    public static class Order {
        private List<Menu> items;

        public Order() {
            items = new ArrayList<>();
        }

        public void addItem(Menu menu) {
            items.add(menu);
        }

        public int getTotal() {
            int total = 0;
            for (Menu m : items) {
                total += m.getPrice();
            }
            return total;
        }

        public int getDiscount() {
            return getTotal() > 40000 ? 5000 : 0;
        }

        public int getFinalTotal() {
            return getTotal() - getDiscount();
        }

        public String getItemsAsString() {
            StringBuilder result = new StringBuilder();
            for (Menu m : items) {
                result.append(m.getName()).append(", ");
            }
            return result.toString();
        }
    }

    // ================= DATA MENU =================
    public static Menu[] getMenuList() {
        return new Menu[] {
            new Menu("Bakwan", 10000),
            new Menu("Tempe", 10000),
            new Menu("Kentang Goreng", 15000),
            new Menu("Roti Isi Ayam", 15000),
            new Menu("Tahu", 10000),
            new Menu("Capucinno", 8000),
            new Menu("Chocolatos", 8000),
            new Menu("Matcha", 8000)
        };
    }
}