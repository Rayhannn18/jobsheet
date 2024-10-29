import java.util.Scanner;
public class PemilihanBilangan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) 
        {
            System.out.println("angka" + angka + "termasuk bilangan genap");
        }
        else 
        {
            System.out.println("angka" + angka + "termasuk bilangan ganjil");
        }
        sc.close();
    }
}
