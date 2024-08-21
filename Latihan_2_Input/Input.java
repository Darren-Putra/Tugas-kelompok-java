package Latihan_2_Input;
import java.util.Scanner;

class hitung {
    private static int uJumlah;
        // harga satuan
    private static int hbolpoint;
    private static int hpensil;
    private static int hpenghapus;

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


    

  
    public hitung(int uJumlah){
        hitung.uJumlah = uJumlah;
    }

    public int getUjumlah(){
        return uJumlah;
    }


    
}
public class Input {
    public static void main(String[] args) {
        hitung.setHpulpen(2000);
        hitung.setHpensil(1000);
        hitung.setHpenghapus(500);

    

    @SuppressWarnings("resource")
    Scanner iNama = new Scanner(System.in);
    @SuppressWarnings("resource")
    Scanner iJumlah = new Scanner(System.in);


    System.out.println("Kode barang Bolpoint  : 1");
    System.out.println("Kode barang Pensil    : 2");
    System.out.println("Kode barang Penghapus : 3");
    System.out.println("===================================");
    System.out.print("Masukan angka barang yang ingin anda beli: ");
    int uNama = iNama.nextInt();
    if (uNama == 1) {
        System.out.println("Anda memilih Bolpoint, berapa jumlah Bolpoint yang ingin anda beli? ");
        int uJumlah = iJumlah.nextInt();
        System.out.println("Total harga yang harus anda bayar adalah: " +hitung.getHpulpen() * uJumlah);


    }
    if (uNama == 2) {
        System.out.println("Anda memilih Pensil, berapa jumlah Pensil yang ingin anda beli? ");
        int uJumlah = iJumlah.nextInt();
        System.out.println("Total harga yang harus anda bayar adalah: " +hitung.getHpensil() * uJumlah);


    }
    if (uNama == 3) {
        System.out.println("Anda memilih Penghapus, berapa jumlah Penghapus yang ingin anda beli? ");
        int uJumlah = iJumlah.nextInt();
        System.out.println("Total harga yang harus anda bayar adalah: " +hitung.getHpenghapus() * uJumlah);


    }
    }
}