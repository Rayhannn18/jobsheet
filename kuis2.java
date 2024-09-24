import java.util.Scanner;
public class kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi variabel
        double kecepatan = 70.0; // km/jam
        double waktu = 1.25; // jam
        
        // Menghitung jarak dalam kilometer
        double jarakKm = kecepatan * waktu;
        
        // Mengonversi jarak ke meter (1 km = 1000 meter)
        double jarakMeter = jarakKm * 1000;
        
        // Menampilkan output satu per satu
        System.out.println("Kecepatan Pak Romi\t\t\t\t\t\t\t\t: " + kecepatan + " km/jam");
        System.out.println("Waktu perjalanan\t\t\t\t\t\t\t\t: " + waktu + " jam");
        System.out.println("Jarak dari Polinema ke lokasi kerja\t\t\t\t\t\t: " + jarakKm + " km");
        System.out.println("Jarak dari Polinema ke lokasi kerja dalam meter\t\t\t\t\t: " + jarakMeter + " meter");
        sc.close();
    }
}

