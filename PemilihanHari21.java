import java.util.Scanner;

public class PemilihanHari21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayName, dayType;
        System.out.print("Pengecekan hari Marties : ");
        dayName = input.nextLine();
        input.close();
        dayType = "";
        switch (dayName.toLowerCase()) {
            case "senin":
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                dayType = "Hari Produktif";
                break;
            case "sabtu":
            case "minggu":
                dayType = "Hari Libur";
                break;
            default:
                dayType = "data yang anda masukkan salah";
                break;
        }

        System.out.println(dayName + " adalah " + dayType);

    }
}
