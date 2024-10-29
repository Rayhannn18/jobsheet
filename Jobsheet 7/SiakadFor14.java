import java.util.Scanner;
public class SiakadFor14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int JumlahLulus = 0, JumlahTidakLulus = 0;
        final double Batal_Kelulusan = 60.0; 

        for (int i = 1; i <= 10; i++  ) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= Batal_Kelulusan) {
                JumlahLulus++;
            } else {
                JumlahTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Mahasiswa yang Lulus: " + JumlahLulus);
        System.out.println("Mahasiswa yang tidak Lulus: " + JumlahTidakLulus);
        sc.close();
    }
}