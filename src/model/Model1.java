package model;

public class Model1 {

    private String kodeKota;
    private String namaKota;
    private int hargaPerKg;
    private String keterangan;

    private double beratButet;
    private double beratUcok;
    private double totalBerat;
    private double totalOngkir;
    private String promo;

    public Model1(String kodeKota, double beratButet) {
        this.kodeKota = kodeKota.toUpperCase();
        this.beratButet = beratButet;
        this.beratUcok = 1.5 * beratButet;

        setKota();
        hitung();
    }

    private void setKota() {
        switch (kodeKota) {
            case "MDN":
                namaKota = "Medan";
                hargaPerKg = 8000;
                keterangan = "Dalam Pulau";
                break;
            case "BLG":
                namaKota = "Balige";
                hargaPerKg = 5000;
                keterangan = "Dalam Pulau";
                break;
            case "JKT":
                namaKota = "Jakarta";
                hargaPerKg = 12000;
                keterangan = "Luar Pulau";
                break;
            case "SBY":
                namaKota = "Surabaya";
                hargaPerKg = 13000;
                keterangan = "Luar Pulau";
                break;
            default:
                namaKota = "Tidak Diketahui";
                hargaPerKg = 0;
                keterangan = "-";
        }
    }

    private void hitung() {
        totalBerat = beratButet + beratUcok;
        totalOngkir = totalBerat * hargaPerKg;
        promo = "";

        if (totalBerat > 10) {
            totalOngkir *= 0.9;
            promo += "Diskon 10% ";
        }

        if (keterangan.equals("Luar Pulau")) {
            promo += "Asuransi Gratis";
        }

        if (promo.equals("")) {
            promo = "Tidak ada promo";
        }
    }

    public void cetakStruk() {
        System.out.println("===== STRUK PEMBAYARAN =====");
        System.out.println("Kota Tujuan     : " + namaKota);
        System.out.println("Berat Butet     : " + beratButet + " kg");
        System.out.println("Berat Ucok      : " + beratUcok + " kg");
        System.out.println("Total Berat     : " + totalBerat + " kg");
        System.out.println("Total Ongkir    : Rp " + totalOngkir);
        System.out.println("Promo           : " + promo);
        System.out.println("============================\n");
    }
}