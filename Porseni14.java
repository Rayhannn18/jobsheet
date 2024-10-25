import java.util.Scanner;
public class Porseni14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); 

     
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        String[][][] atlet = new String[cabangOlahraga.length][jumlahPoliteknik][5];

        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama atlet untuk cabor " + cabangOlahraga[i] + ":");
            for (int j = 0; j < jumlahPoliteknik; j++) {
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.print("Nama atlet " + (k + 1) + ": ");
                    atlet[i][j][k] = sc.nextLine();
                }
            }
        }

        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabor: " + cabangOlahraga[i]);
            for (int j = 0; j < jumlahPoliteknik; j++) {
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.println("Atlet " + (k + 1) + ": " + atlet[i][j][k]);
                }
            }
        }
        sc.close();
}
}
