package model;

import java.util.HashMap;

public class Model2 {
    private HashMap<String, Integer> dataStok;

    // Constructor
    public Model2() {
        dataStok = new HashMap<>();

        // Stok awal gudang
        dataStok.put("MYK", 120); // Minyak
        dataStok.put("RPK", 5);   // Rok Pramuka
        dataStok.put("GLA", 85);  // Gula
        dataStok.put("DSD", 22);  // Dasi SD
    }

    // Method ambil stok berdasarkan kode
    public int getStokByKode(String kode) {
        return dataStok.getOrDefault(kode, 0);
    }
}