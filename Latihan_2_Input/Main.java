package Latihan_2_Input;

class barang {
    // nama
    private static String bolpoint;
    private static String pensil;
    private static String penghapus;

    // barang
    private static int sbolpoint;
    private static int spensil;
    private static int spenghapus;

    // harga satuan
    public static int hbolpoint;
    private static int hpensil;
    private static int hpenghapus;

    // harga
    @SuppressWarnings("unused")
    private int harga;

    public barang(int sbolpoint, int spensil, int spenghapus) {
        barang.sbolpoint = sbolpoint;
        barang.spensil = spensil;
        barang.spenghapus = spenghapus;
    }

    // set nama
    public static void setPulpen(String namaPulpen) {
        bolpoint = namaPulpen;
    }

    public static void setPensil(String namaPensil) {
        pensil = namaPensil;
    }

    public static void setPenghapus(String namaPenghapus) {
        penghapus = namaPenghapus;
    }

    // set barang
    public static void setSpulpen(int stokPulpen) {
        sbolpoint = stokPulpen;
    }
    
    public static void setSpensil(int stokPensil) {
        spensil = stokPensil;
    }

    public static void setSpenghapus(int stokPenghapus) {
        spenghapus = stokPenghapus;
    }

    // set harga satuan
    public static void setHpulpen(int hargaPulpen) {
        hbolpoint = hargaPulpen;
    }

    public static void setHpensil(int hargaPensil) {
        hpensil = hargaPensil;
    }

    public static void setHpenghapus(int hargaPenghapus) {
        hpenghapus = hargaPenghapus;
    }

    // getter nama
    public static String getPulpen() {
        return bolpoint;
    }

    public static String getPensil() {
        return pensil;
    }

    public static String getPenghapus() {
        return penghapus;
    }

    // getter barang
    public static int getSpulpen() {
        return sbolpoint;
    }

    public static int getSpensil() {
        return spensil;
    }

    public static int getSpenghapus() {
        return spenghapus;
    }

    // getter harga satuan
    public static int getHpulpen() {
        return hbolpoint;
    }

    public static int getHpensil() {
        return hpensil;
    }

    public static int getHpenghapus() {
        return hpenghapus;
    }

    // hitung harga * barang pulpen
    public static int hitungHargaPulpen() {
        return (sbolpoint * hbolpoint);
    }

    // hitung harga * barang pensil
    public static int hitungHargaPensil() {
        return (spensil * hpensil);
    }

    // hitung harga * barang penghapus
    public static int hitungHargaPenghapus() {
        return (spenghapus * hpenghapus);
    }
}

public class Main {

    public static void main(String[] args) {
        barang.setPulpen("Pulpen");
        barang.setPensil("Pensil");
        barang.setPenghapus("Penghapus");

        barang.setSpulpen(10);
        barang.setSpensil(10);
        barang.setSpenghapus(10);

        barang.setHpulpen(2000);
        barang.setHpensil(1000);
        barang.setHpenghapus(500);


        //print

        
        System.out.println("Nama Barang: " + barang.getPensil());
        System.out.println("Stok " + barang.getSpensil());
        System.out.println("Harga Satuan " + barang.getHpensil());
        System.out.println("Total jika terjual semua " + barang.hitungHargaPensil());
        System.out.println("=================================");
        
        System.out.println("Nama Barang: " + barang.getPulpen());
        System.out.println("Stok " + barang.getSpulpen());
        System.out.println("Harga Satuan " + barang.getHpulpen());
        System.out.println("Total jika terjual semua " + barang.hitungHargaPulpen());
        System.out.println("=================================");

        System.out.println("Nama Barang: " + barang.getPenghapus());
        System.out.println("Stok " + barang.getSpenghapus());
        System.out.println("Harga Satuan " + barang.getHpenghapus());
        System.out.println("Total jika terjual semua " + barang.hitungHargaPenghapus());
        System.out.println("=================================");
    }
}