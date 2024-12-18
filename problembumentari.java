import java.util.Scanner;
public class MovieRatings { // Mengganti interface dengan class
    public static void main(String[] args) { // Memperbaiki deklarasi main
        double[][] ratings = new double[3][4]; // Memperbaiki tipe array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ratings.length; i++) { // Mengganti ffor dan memperbaiki kondisi
            for (int j = 0; j < ratings[0].length; j++) { // Mengganti jj dengan j
                System.out.print("Enter array value[" + i + "," + j + "]: ");
                ratings[i][j] = sc.nextDouble(); // Memperbaiki tipe input ke double
            }
        }
        System.out.println("Array values:");
        for (double[] rate : ratings) { // Memperbaiki sintaks foreach
            for (double val : rate) { // Mengganti i dengan val
                System.out.print(val + " "); // Menggunakan val untuk output
            }
            System.out.println();
        }
        sc.close(); // Menutup Scanner
    }
}