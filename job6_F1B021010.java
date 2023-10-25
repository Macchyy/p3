package p3js;
import java.util.Scanner;

public class P3JS{
 String judul;
 int halaman;
 
 public P3JS(String judul) {
 this.judul = judul;
 }
 public P3JS(int halaman) {
 this.halaman = halaman;
 }
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.print("Judul buku   : ");
 String judul = input.nextLine();
 
 System.out.print("Halaman buku : ");
 int halaman = input.nextInt();
 }
}
