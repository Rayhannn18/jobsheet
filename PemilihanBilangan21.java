import java.util.Scanner;

public class PemilihanBilangan21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========= MENCARI ANGKA GENAP DAN GANJIL =========");

        System.out.print("masukkan angka :");
        int number = input.nextInt();

        String hasil = (number % 2 == 0) ? " adalah angka genap" : " adalah angka ganjil";
        System.out.println("Angka " + number + hasil);
        input.close();

    }
}