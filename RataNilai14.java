import java.util.Scanner;
public class RataNilai14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        float nilai, totalNilai, rataNilai;

        for (int i = 1; i <= 5; i++) { 
            int totalnilai = 0; 
            System.out.println("Input Nilai Mahasiswa ke " + i); 
            for (int j = 1; j <= 5; j++) { 
                System.out.print("Nilai ke-" + j + " = ");
                int nilaimhs = sc.nextInt();
                totalnilai += nilaimhs;
            }
            float ratanilai = (float) totalnilai / 5; 
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + ratanilai);
        }
        sc.close(); 
    }

}
