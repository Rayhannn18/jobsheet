package Quiz;
import java.util.Scanner;
public class kuis1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Program tanggal lahir----------");
        // Input current date
        System.out.print("Masukkan tanggal hari ini: ");
        int currentDay = sc.nextInt();
        System.out.print("Masukkan bulan hari ini: ");
        int currentMonth = sc.nextInt();
        System.out.print("Masukkan tahun hari ini: ");
        int currentYear = sc.nextInt();

        // Input birth date
        System.out.print("Masukkan tanggal lahir: ");
        int birthDay = sc.nextInt();
        System.out.print("Masukkan bulan lahir: ");
        int birthMonth = sc.nextInt();
        System.out.print("Masukkan tahun lahir: ");
        int birthYear = sc.nextInt();

        // Calculate age
        int ageYears = currentYear - birthYear;
        int ageMonths = currentMonth - birthMonth;
        int ageDays = currentDay - birthDay;

        // Adjust if the current month/day is less than the birth month/day
        if (ageDays < 0) {
            ageDays += 31;
            ageMonths--;
        }
        if (ageMonths < 0) {
            ageMonths += 12;
            ageYears--;
        }

        // Output the calculated age
        System.out.println("Anda lahir pada tanggal " + birthDay + "-" + birthMonth + "-" + birthYear);
        System.out.println("Jadi usia Anda sekarang adalah " + ageYears + " tahun " + ageMonths + " bulan " + ageDays + " hari.");
        sc.close();
    }
}
