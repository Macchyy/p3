
package P3;

import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    String nama;
    double harga;
    int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }
}

public class TokoBaju {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(String nama, double harga, int stok) {
        Barang barang = new Barang(nama, harga, stok);
        daftarBarang.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-------------Daftar Baju-------------");
        
        for (Barang barang : daftarBarang) {
        System.out.println(barang.getNama() + "\nHarga  : " + barang.getHarga() + "\nStok   : " + barang.getStok());
        System.out.println("--------------------------------------------------------------------");
        }
    }

    public void beliBarang(String nama, int jumlah) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equals(nama)) {
                if (barang.getStok() >= jumlah) {
                    double totalHarga = barang.getHarga() * jumlah;
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("Anda telah membeli " + jumlah + " " + nama + " dengan total harga: Rp." + totalHarga);
                    barang.kurangiStok(jumlah);
                } else {
                    System.out.println("Stok " + nama + " tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Barang dengan nama " + nama + " tidak ditemukan.");
    }

    public static void main(String[] args) {
        TokoBaju toko = new TokoBaju();
        toko.tambahBarang("KAOS", 100000, 89);
        toko.tambahBarang("KEMEJA", 175000, 78);
        toko.tambahBarang("JAKET", 300000, 65);

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("-----------------Menu---------------- ");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli Barang");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
       
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    toko.tampilkanBarang();
                    break;
                case 2:
                    System.out.println("--------------------------------------------------------------------");
                    System.out.print("Masukkan nama barang yang akan dibeli : ");
                    String nama = scanner.next();
                    System.out.println("--------------------------------------------------------------------");
                    System.out.print("Masukkan jumlah yang akan dibeli      : ");
                    int jumlah = scanner.nextInt();
                    toko.beliBarang(nama, jumlah);
                    break;
                case 3:
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("Terima kasih telah berbelanja");
                    break;
                default:
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}

