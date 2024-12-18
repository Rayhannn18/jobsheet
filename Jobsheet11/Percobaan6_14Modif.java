package Jobsheet11;
import java.util.Scanner;
public class Percobaan6_14Modif {
    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static int hitungVolume(int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        int lebar = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        int tinggi = sc.nextInt();

        int luas = hitungLuas(panjang, lebar);
        System.out.println("Luas Persegi Panjang Adalah: " + luas);

        int volume = hitungVolume(panjang, lebar, tinggi);
        System.out.println("Volume Balok Adalah: " + volume);
    }

}
