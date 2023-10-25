package p3js;
import java.util.Scanner;

public class P3JS {
 double hitungKecepatan;
 
 public P3JS(int jarak,int waktu){
 hitungKecepatan = jarak / waktu;
 }
 public double hitungKecepatan(){
 return hitungKecepatan;
 }
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.print("Jarak tempuh   : ");
 int jarak = input.nextInt();
 System.out.print("Watu tempuh    : ");
 int waktu = input.nextInt();
 
 P3JS hasil = new P3JS (jarak,waktu);
 System.out.println("Kecepatan tempuh: " +hasil.hitungKecepatan());
 
 }
}

