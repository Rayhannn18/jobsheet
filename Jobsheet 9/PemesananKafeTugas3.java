import java.util.Scanner;
public class PemesananKafeTugas3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           String[] menu = {"Kwetiau Goreng", "Kwetiau Basah", "Iga Bakar", 
                         "Cireng Isi", "Americano", "Lychee Tea", "Mineral Water"};
        
        System.out.println("Menu Kafe:");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan \"" + cariMakanan + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + cariMakanan + "\" tidak ditemukan di menu.");
        }
    }
}