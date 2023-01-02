import java.util.Scanner;
public class PercobaaEmpat031D {
    static int kali031D(int C,int D){
        int H;
        H = (C + 10) % (D + 19);
        return H;
    }

    static  int kurang031D(int A,int B){
        int X;
        A = A+7;
        B = B+4;
        X = kali031D(A,B);
        return X;
    }
    static int tambah031D (int X, int Y){
        int F;
        int a = X * Y;
        int b = X - Y;
        F = a + b;
        return F;
    }
    public static void main(String[]args){
        int nilai1, nilai2;
        Scanner andyNugraha031D = new Scanner(System.in);
        System.out.println("Masukkan Nilai 1 : ");
        nilai1 = andyNugraha031D.nextInt();
        System.out.println("Masukkan Nilai 2 : ");
        nilai2 = andyNugraha031D.nextInt();
        int hasil031D = kurang031D(nilai1,nilai2);
        System.out.println("Hasil Akhir Adalah " + hasil031D);
         hasil031D = tambah031D(nilai1,hasil031D);
        System.out.println("Hasil Akhir Adalah " + hasil031D);
    }
}
