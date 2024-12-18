// Nama : Rayhan Giri Putra
// NIM : 244107060122
// No Absen : 14

import java.util.Scanner;
public class UASPrakDaspro14 {
    static Scanner scanner = new Scanner(System.in);
    static String[] namaTim;
    static int[][] skorTim;
    static int[] totalSkor;

    public static void main(String[] args) {
        int pilihan = 0;
        boolean dataDiinput = false;

        while (pilihan != 4) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                inputDataSkor();
                dataDiinput = true;
            } else if (pilihan == 2) {
                if (dataDiinput) {
                    tampilkanTabelSkor();
                } else {
                    System.out.println("Data belum diinput. Pilih menu terlebih dahulu.");
                }
            } else if (pilihan == 3) {
                if (dataDiinput) {
                    tentukanJuara();
                } else {
                    System.out.println("Data belum diinput. Pilih menu terlebih dahulu.");
                }
            } else if (pilihan == 4) {
                System.out.println("Program selesai. Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }

    static void inputDataSkor() {
        System.out.print("Masukkan jumlah tim: ");
        int jumlahTim = scanner.nextInt();
        namaTim = new String[jumlahTim];
        skorTim = new int[jumlahTim][2];
        totalSkor = new int[jumlahTim];

        System.out.print("Silahkan Input Nama Tim dan Skornya");

        for (int i = 0; i < jumlahTim; i++) {
            scanner.nextLine();
            System.out.print("\nMasukkan nama tim ke-" + (i + 1) + ": ");
            namaTim[i] = scanner.nextLine();
            skorTim[i][0] = inputSkor("Level 1");
            if (skorTim[i][0] < 35) {
                skorTim[i][0] = 0; 
            }
            skorTim[i][1] = inputSkor("Level 2");
            totalSkor[i] = skorTim[i][0] + skorTim[i][1];
        }
    }

    static int inputSkor(String level) {
        int skor;
        while (true) {
            System.out.print("Masukkan skor untuk " + level + ": ");
            skor = scanner.nextInt();
            if (skor >= 0) {
                break;
            } else {
                System.out.println("Skor tidak boleh negatif. Silahkan input ulang.");
            }
        }
        return skor;
    }

    static void tampilkanTabelSkor() {
        System.out.println("\n=== TABEL SKOR TURNAMEN ===");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        for (int i = 0; i < namaTim.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d\n", namaTim[i], skorTim[i][0], skorTim[i][1], totalSkor[i]);
        }
    }

    static void tentukanJuara() {
        int skorTertinggi = totalSkor[0];
        int level2Tertinggi = skorTim[0][1];
        String juara = namaTim[0];
        boolean seri = false;

        for (int i = 1; i < totalSkor.length; i++) {
            if (totalSkor[i] > skorTertinggi) {
                skorTertinggi = totalSkor[i];
                level2Tertinggi = skorTim[i][1];
                juara = namaTim[i];
                seri = false;
            } else if (totalSkor[i] == skorTertinggi) {
                if (skorTim[i][1] > level2Tertinggi) {
                    level2Tertinggi = skorTim[i][1];
                    juara = namaTim[i];
                    seri = false;
                } else if (skorTim[i][1] == level2Tertinggi) {
                    seri = true;
                }
            }
        }
        if (seri) {
            System.out.println("\nTurnamen berakhir seri. Tidak ada pemenang mutlak.");
        } else {
            System.out.println("\nSelamat kepada tim " + juara + " yang telah memenangkan kompetisi!");
            System.out.println("Untuk Tim yang Belum Semangat!!, Jangan Putus Asa.");
        }
    }
}
