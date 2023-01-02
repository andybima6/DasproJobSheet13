import java.util.Scanner;
public class PercobaanLima031D {
    static void Tampi031D(String str,int ...a){
        System.out.println("String : "+ str);
        System.out.println("Jumlah Argumen/Parameter : " + a.length);

        for (int i : a){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String argx[]){
        Tampi031D("Daspro 2019",100,200);
        Tampi031D("Teknlogi Informasi",1,2,3,4,5);
        Tampi031D("Polinema");
    }
}
