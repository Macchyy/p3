/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

/**
 *
 * @author ASUS
 */
class Mobil {
    String plat;
    String merk;

    public Mobil() {

    }

    public Mobil(String p, String m) {
        plat = p;
        merk = m;
    }

    public void tampil() {
        System.out.println("Nomor Plat      : " + plat);
        System.out.println("Jenis Kendaraan : " + merk);
        System.out.println("---------------------------------------------");
    }
}

public class TugasAC {
    public static void main(String[] args) {
        Mobil A = new Mobil("RQ 2705 XYZ","Veloz");
        Mobil B = new Mobil("RQ 2705 XYZ","BMW 320i");
        Mobil C = new Mobil("RQ 2705 XYZ","Civic Turbo");
        Mobil D = new Mobil();
        


        System.out.println("----------------DATA KENDARAAN---------------");
        A.tampil();
        B.tampil();
        C.tampil();
        D.tampil();
    }
}
