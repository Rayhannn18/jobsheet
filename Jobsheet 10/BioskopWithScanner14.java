import java.util.Scanner;import java.util.Scanner;
public class BioskopWithScanner14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;
        int menuOption;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menuOption = sc.nextInt();
            sc.nextLine(); 

            switch (menuOption) {
                case 1:

                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        boolean validSeat = false;
                        while (!validSeat) {
                            System.out.print("Masukkan Baris (1-4): ");
                            baris = sc.nextInt();
                            sc.nextLine(); 

                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > 4) {
                                System.out.println("Baris tidak tersedia. Silakan masukkan angka antara 1 dan 4.");
                            } else if (kolom < 1 || kolom > 2) {
                                System.out.println("Kolom tidak tersedia. Silakan masukkan angka antara 1 dan 2.");
                            } else {
                                if (penonton[baris - 1][kolom - 1] != null) {
                                    System.out.println("Tempat duduk sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih tempat duduk lain.");
                                } else {
                                    penonton[baris - 1][kolom - 1] = nama;
                                    System.out.println("Penonton " + nama + " telah ditambahkan.");
                                    validSeat = true; 
                                }
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***"); 
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Selamat tinggal.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            sc.close();
        }
    }
}
