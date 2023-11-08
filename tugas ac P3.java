package tugasac;

class PlatKendaraan {
    String nomorPlat;
    String jenisKendaraan;

    public PlatKendaraan() {

    }

    public PlatKendaraan(String nomorPlat, String jenisKendaraan) {
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    public void tampil() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
    }
}

public class tugasac {
    public static void main(String[] args) {
        PlatKendaraan a = new PlatKendaraan();
        PlatKendaraan b = new PlatKendaraan();
        PlatKendaraan c = new PlatKendaraan();
        
        a.nomorPlat = "DR 5324 AB";
        a.jenisKendaraan = "Mobil \n";
        b.nomorPlat = "DR 7634 ZE";
        b.jenisKendaraan = "Motor \n";
        c.nomorPlat = "DR 5112 DI";
        c.jenisKendaraan = "Motor \n";

        System.out.println("DATA PLAT KENDARAAN \n");
        a.tampil();
        b.tampil();
        c.tampil();
    }
}
