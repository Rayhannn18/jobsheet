import java.util.Scanner;
public class UTSManajemenToko14 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan informasi barang
        String nama = "";
        int jumlahStok = 0;
        double hargaPerUnit = 0.0;

        while (true) {
            System.out.print("Masukkan nama barang (atau ketik 'selesai' untuk keluar): ");
            nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok: ");
            jumlahStok = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan harga per unit: ");
            hargaPerUnit = Double.parseDouble(scanner.nextLine());

            // Menghitung total nilai stok
            double totalNilaiStok = jumlahStok * hargaPerUnit;
            System.out.printf("Total nilai stok untuk %s: %.2f\n", nama, totalNilaiStok);

            // Menghandle permintaan produk
            System.out.print("Masukkan jumlah permintaan: ");
            int permintaan = Integer.parseInt(scanner.nextLine());

            // Memeriksa ketersediaan stok dan mengurangi stok jika cukup
            if (permintaan <= jumlahStok) {
                jumlahStok -= permintaan; // Mengurangi stok secara langsung
                System.out.printf("Permintaan dapat dipenuhi. Stok tersisa: %d\n", jumlahStok);
            } else {
                System.out.println("Stok tidak mencukupi.");
            }
        }

        System.out.println("Permintaan selesai. Terima kasih!");
        scanner.close();
    }

}