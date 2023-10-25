package p3js;
import java.util.Scanner;

public class P3JS {

 double energiPotensial;
 final double gravitasi = 9.81;
 
 public P3JS(double massa, double gravitasi, double tinggi){
 energiPotensial = massa*gravitasi*tinggi;
 }
 
 public double getEnergiPotensial(){
 return energiPotensial;
 }
 
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.print("Massa benda        : ");
 double massa = input.nextInt();
 System.out.print("Tinggi             : ");
 double tinggi = input.nextInt();
 
 P3JS energi = new P3JS(massa, 9.81, tinggi);
 
 double hasilEnergiPotensial = energi.getEnergiPotensial();
 System.out.println("Energi Potensial   : " +hasilEnergiPotensial);
 }

}