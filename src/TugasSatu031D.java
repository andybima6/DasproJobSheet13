import java.util.Scanner;
public class TugasSatu031D {
static int hitungVolume031D(int sisi){
        int volume = sisi * sisi * sisi;
        return volume;
        }
        static int hitungPermukaan031D (int sisi){
        int luas031D= 6 * sisi * sisi;
        return luas031D;
        }
        public static void main(String[] args) {
        int hasil031D;
        hasil031D = hitungPermukaan031D(7);
        System.out.println("Luas Permukaan Kubus Dengan sisi 7 Adalah = " + hasil031D);
        hasil031D = hitungVolume031D(7);
        System.out.println("Volume Kubus Dengan Sisi 7 adalah = " + hasil031D);
        }
}
