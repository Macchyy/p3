package p3js;

public class P3JS {
 String hari;
 String bulan;
 int tanggal;
 int tahun;
 
 public P3JS(String hari, String bulan){
 this.hari = hari;
 this.bulan = bulan;
 }
 public P3JS(int tahun, int tanggal) {
 this.tanggal = tanggal;
 this.tahun = tahun;
 }
 public static void main(String[] args){
     
 P3JS lahir1 = new P3JS("Selasa","Juni");
 P3JS lahir2 = new P3JS(2003, 3);
 
 System.out.println("Hari   : " + lahir1.hari);
 System.out.println("Tanggal: " + lahir2.tanggal);
 System.out.println("Bulan  : " + lahir1.bulan);
 System.out.println("Tahun  : " + lahir2.tahun);
 }
}