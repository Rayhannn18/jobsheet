import java.util.Scanner;
public class PemilihanHari14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String DayName, DayType;
        System.out.print("Input day name: ");
        DayName = sc.nextLine();
        
        switch (DayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                DayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                DayType = "weekend";
                break;
            default:
                DayType = "Invalid day name";
                
        }
        System.out.println(DayName + "\tis a\t" + DayType);
        sc.close();
    }    
}
