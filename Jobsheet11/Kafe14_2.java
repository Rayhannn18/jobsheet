package Jobsheet11;
public class Kafe14_2 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        
        double diskon = 0.0;

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            diskon += 0.10; 
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo berlaku: DISKON50. Anda mendapatkan diskon tambahan 50%!");
            diskon += 0.50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo berlaku: DISKON30. Anda mendapatkan diskon tambahan 30%!");
            diskon += 0.30;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("====== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam     - Rp 15.000");
        System.out.println("2. Cappuccino     - Rp 20.000");
        System.out.println("3. Latte          - Rp 22.000");
        System.out.println("4. Teh Tarik      - Rp 12.000");
        System.out.println("5. Roti Bakar     - Rp 10.000");
        System.out.println("6. Mie Goreng     - Rp 18.000");
        System.out.println("=============================");

        if (diskon > 0) {
            System.out.printf("Total diskon yang Anda dapatkan: %.0f%%\n", diskon * 100);
            System.out.println("Nikmati pembelian dengan potongan harga sesuai diskon Anda!");
        }

        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50"); 
    }
}
