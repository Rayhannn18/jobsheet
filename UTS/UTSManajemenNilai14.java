package UTS;
import java.util.Scanner;
public class UTSManajemenNilai14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        int jumlahDiAtasRataRata= 0;
        final double Batal_Kelulusan = 50.0; 
        float totalNilai = 0, rataNilai;

        // Looping untuk meminta nilai mahasiswa
        for (int i = 1; i <= 8; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            totalNilai += nilai;  // Menambahkan nilai ke total

            // Memeriksa nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // Menghitung jumlah lulus dan tidak lulus
            if (nilai >= Batal_Kelulusan) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        String kesimpulan;
        if (jumlahDiAtasRataRata > 8 / 2) {
            kesimpulan = "Mayoritas siswa memiliki nilai di atas rata-rata.";
        } else {
            kesimpulan = "Mayoritas siswa tidak memiliki nilai di atas rata-rata.";
        }

        // Menghitung rata-rata
        rataNilai = totalNilai / 8;

        // Menampilkan hasil
        System.out.println("\nNilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
        System.out.println("Rata-rata nilai: " + rataNilai);
        System.out.println(kesimpulan);

        sc.close();  // Menutup scanner
    }
}
