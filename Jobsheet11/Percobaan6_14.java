package Jobsheet11;
import java.util.Scanner;
public class Percobaan6_14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan Lebar: ");
        int lebar = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        int tinggi = sc.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang Adalah: " + luas);

        int volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok Adalah: " + volume);
    }
}
