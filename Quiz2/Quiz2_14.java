import java.util.Scanner;
public class Quiz2_14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        int[] nilai = new int[jumlahSiswa];

        System.out.println("Masukkan nilai ujian:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 0; i < jumlahSiswa; i++) {
            total += nilai[i];
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        double rataRata = (double) total / jumlahSiswa;

        System.out.println("\nHasil:");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        sc.close();
    }
}