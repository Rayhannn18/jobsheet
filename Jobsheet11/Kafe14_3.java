package Jobsheet11;
import java.util.Scanner;
public class Kafe14_3 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("====== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam     - Rp 15.000");
        System.out.println("2. Cappuccino     - Rp 20.000");
        System.out.println("3. Latte          - Rp 22.000");
        System.out.println("4. Teh Tarik      - Rp 12.000");
        System.out.println("5. Roti Bakar     - Rp 10.000");
        System.out.println("6. Mie Goreng     - Rp 18.000");
        System.out.println("=============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalHarga = hargaItems [pilihanMenu - 1] * banyakItem;
        return totalHarga;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        System.out.println("\nMasukkan nomor menu yang anda ingin pesan");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan banyak item yang ingin pesan");
        int banyakItem = sc.nextInt();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total Harga untuk pesanan anda adalah Rp " + totalHarga);
    }
}
