package p3js;

public class P3JS { 
    String x;
    double ipk;

public P3JS( ) {
    
}
public P3JS(String nma) {
    x=nma;
}

public P3JS(String nma, double ipk) {
    x=nma;
    this.ipk=ipk;
}

public static void main(String[] args){ 
P3JS mhs = new P3JS("ZUNISTIRA",4.00);

System.out.println("Nama    : "+mhs.x);
System.out.println("IPK     : "+mhs.ipk);
}
}
