package p3js;
import java.util.Scanner;

public class P3JS {
 int hitungDebit;
 
 public P3JS(int volume, int waktu){
 hitungDebit = volume/waktu;
 }
 
 public int hitungDebit(){
 return hitungDebit;
 }
 
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Volume air  : ");
        int volume = input.nextInt(); 

        System.out.println("Waktu       : ");
        int waktu = input.nextInt(); 
        
        P3JS nilai = new P3JS(volume, waktu);
        System.out.println("Debit air   : " + nilai.hitungDebit());
    }
}
