package p3js;

public class P3JS {
 private String nama;
 private int tahun;
 
 public P3JS(String nama) {
 this.nama = nama;
 }
 public P3JS(int tahun) {
 this.tahun = tahun;
 }
 
 public String getNama(){
 return nama;
 }
 public void setNama(){
 this.nama = nama;
 }
 public int getTahun(){
 return tahun;
 }
 public void setTahun(){
 this.tahun = tahun;
 }
 
 public static void main(String[] args){
    P3JS A=new P3JS ("Avanza");
    P3JS B=new P3JS (2011);
   
 System.out.println("Jenis mobil: " +A.getNama());
 System.out.println("Tahun mobil: " +B.getTahun());
 }
}
