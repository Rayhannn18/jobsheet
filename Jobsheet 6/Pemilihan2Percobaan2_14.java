import java.util.Scanner;
public class Pemilihan2Percobaan2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan_menu;
        String member, payment_metode;
        double diskon = 0, total_bayar, harga = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextInt();
        input.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.print("Metode pembayaran (qris/cash)  = ");
        payment_metode = input.nextLine();
        System.out.println("-------------------------");
        input.close();
        System.out.println("======= STRUK PEMBAYARAN ======= \n");

        total_bayar = 0;
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1;
            System.out.println("Mendapatkan Diskon 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Risbowl : " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Es teh : " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling : " + harga);
            } else {
                System.out.println("Masukan Pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);

        } else if (member.equalsIgnoreCase("n")) {

            System.out.println("Mencapatkan Diskon 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Risbowl : " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Es teh : " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling : " + harga);
            } else {
                System.out.println("Masukan Pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;

        }
        double final_payment = 0;
        if (payment_metode.equalsIgnoreCase("qris")) {
            final_payment = total_bayar - 1000;
        } else {
            final_payment = total_bayar;
        }
        System.out.println("Member \t\t :" + member);
        System.out.println("Metode bayar  \t: " + payment_metode);
        System.out.println("Total bayar  \t: " + final_payment);

    }
}