import java.util.Scanner;
public class PercobaanEnam031D {
    public static void main(String[] args){
        Scanner andyNugraha031D = new Scanner(System.in);

        int p,l,t,L,vol;
        System.out.println("Masukkan Panjang");
        p = andyNugraha031D.nextInt();
        System.out.println("Masukkan Lebar");
        l = andyNugraha031D.nextInt();
        System.out.println("Masukkan Tinggi");
        t = andyNugraha031D.nextInt();

        L = p*l;
        System.out.println("Luas Persegi Panjang Adalah " + L);

        vol = p*l*t;
        System.out.println("volume Balok Adalah " + vol);
    }

}
