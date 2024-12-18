package Jobsheet12;
import java.util.Scanner;
public class Percobaan2_modif {
     public static int hitungPangkat(int angka_pertama, int angka_kedua) {
        if (angka_kedua == 0) {
            System.out.print("1");
            return 1;	
        } else {
            System.out.print(angka_pertama);
            if (angka_kedua > 1) {
                System.out.print(" x ");
            }
            return angka_pertama * hitungPangkat(angka_pertama, angka_kedua - 1);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bilangan yang dihitung:");
        int bilangan = input.nextInt();
        System.out.println("Pangkat:");
        int pangkat = input.nextInt();
        System.out.print("Hasil perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}