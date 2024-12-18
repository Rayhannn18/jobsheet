import java.util.Scanner;

public class PemilihanHariDenganIf14 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String DayType;
        byte DayNumber;
        System.out.println("Masukkan angka 1 hingga 7");
        System.out.println("Masukkan : ");
        DayNumber = input.nextByte();
        input.close();
        DayType = "";
        if (DayNumber >= 1 && DayNumber <= 5) {
            DayType = "Hari produktif";    
        } else if (DayNumber == 6 || DayNumber ==7) {
            DayType = "Hari libur";   
        } else {
            DayType = "Angka yang salah";
        }
        System.out.println(DayNumber + " adalah " + DayType);
    }
}