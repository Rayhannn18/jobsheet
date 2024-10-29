import java.util.Scanner;

public class KafeRayhan14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char membership;
        int CoffeQuantity, TeaQuantitiy, BreadQuantity;
        double CoffePrice = 12000.0, TeaPrice = 7000.0, BreadPrice = 20000.0;
        double discount = 0.1;
        double count, TotalPayment;


        System.out.print(" Status Membership (Y/N) : ");
        membership = input.next().charAt(0);


        System.out.print("masukkan jumlah pembelian kopi : ");
        CoffeQuantity = input.nextInt();


        System.out.print("masukkan jumlah pembelian teh : ");
        TeaQuantitiy = input.nextInt();


        System.out.print("masukkan jumlah pembelian roti : ");
        BreadQuantity = input.nextInt();


        count = (CoffeQuantity * CoffePrice) + (TeaQuantitiy * TeaPrice) + (BreadQuantity * BreadPrice);
        TotalPayment = 0;
        if (membership == 'Y' || membership == 'y') {
            TotalPayment = count - (discount * count);
        } else {
            TotalPayment = count;
        }


        input.close();


        int nominalInt = (int) TotalPayment;
        double discountPrice = count - (count - (count * discount));


        System.out.println("\n======== STRUK PEMBELIAN ======== \n");


        System.out.println("keanggotaan pelanggan     : " + membership);
        System.out.println(
                String.format("Item Pembelian %s Kopi %s Teh %s Roti", CoffeQuantity, TeaQuantitiy, BreadQuantity));
        System.out.println("nominal bayar Rp  : " + nominalInt);
        if (membership == 'Y' || membership == 'y') {
            System.out.println("Anda mendapatkan Potongan Harga  Rp : " + (int) discountPrice);
        }
    }
}