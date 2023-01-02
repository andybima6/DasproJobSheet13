import java.util.Scanner;
public class TugasDua031D {
    static int[][] inputNilai(String[] nama031D, int[][] nilai031D) {
        Scanner andyNugraha031D = new Scanner(System.in);
        for (int a = 0; a < nilai031D.length; a++) {
            System.out.println("Masukkan Nama Mahasiswa = " + nama031D[a]);
            for (int b = 0; b < nilai031D[a].length; b++) {

                System.out.print("Masukkan Nilai Tugas Minggu Ke - " + (b + 1) + " = ");
                nilai031D[a][b] = andyNugraha031D.nextInt();
            }
        }
        andyNugraha031D.close();
        return nilai031D;
    }

    static void tampilNilai(String nama031D[], int nilai031D[][]) {
        for (int a = 0; a < nilai031D.length; a++) {
            System.out.println("Nama Mahasiswa = " + nama031D[a]);
            for (int b = 0; b < nilai031D[a].length; b++) {

                System.out.printf("Nilai Minggu Ke - %d = %d \n", (b + 1),
                        nilai031D[a][b]);
            }
        }
    }

    static void tertinggi(int[][] nilai031D) {
        int max031D = 0;
        int mingguMax031D = 0;
        for (int i = 0; i < nilai031D.length; i++) {
            for (int j = 0; j < nilai031D[i].length; j++) {
                if (max031D < nilai031D[i][j]) {
                    max031D = nilai031D[i][j];
                    mingguMax031D = j + 1;
                }
            }
        }

        System.out.println("Nilai Tertinggi Terdapat Pada Minggu Ke - " + mingguMax031D);
    }

    static void nilaiTertinggi(int[][] nilai031D, String nama031D[]) {
        int max031D = 0;
        int mingguMax031D = 0;
        String namaMHS031D = "";
        for (int i = 0; i < nilai031D.length; i++) {
            for (int j = 0; j < nilai031D[i].length; j++) {
                if (max031D < nilai031D[i][j]) {
                    max031D = nilai031D[i][j];
                    mingguMax031D = j + 1;
                    namaMHS031D = nama031D[i];
                }
            }
        }

        System.out.printf("Nama Mahasiswa %s Memiliki Nilai Tertinggi %d , Dari Minggu ke - %d", namaMHS031D, max031D, mingguMax031D);
    }

    public static void main(String[] args) {
        String nama031D[] = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        int nilai031D[][] = new int[5][7];
        nilai031D = inputNilai(nama031D, nilai031D);
        tampilNilai(nama031D, nilai031D);
        tertinggi(nilai031D);
        nilaiTertinggi(nilai031D, nama031D);
    }
}