import java.util.Scanner;
public class Quiz3_14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelas: ");
        int jumlahKelas = sc.nextInt();
        System.out.print("Masukkan jumlah siswa per kelas: ");
        int jumlahSiswa = sc.nextInt();
        int[][] nilai = new int[jumlahKelas][jumlahSiswa];


        for (int i = 0; i < jumlahKelas; i++) {
            System.out.println("Masukkan nilai untuk Kelas " + (i + 1) + ":");
            for (int j = 0; j < jumlahSiswa; j++) {
                System.out.print("Nilai siswa ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < jumlahKelas; i++) {
            int totalNilai = 0;
            System.out.println("\nNilai untuk Kelas " + (i + 1) + ":");
            for (int j = 0; j < jumlahSiswa; j++) {
                System.out.print(nilai[i][j] + " ");
                totalNilai += nilai[i][j];
            }
            double rataRata = (double) totalNilai / jumlahSiswa;
            System.out.printf("\nRata-rata nilai Kelas %d: %.2f\n", (i + 1), rataRata);
        }
        sc.close();
}
}