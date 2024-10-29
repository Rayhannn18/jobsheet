import java.util.Scanner;
public class ArrayBilangan14 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bil = new int[14];
        bil [0] = 5;
        bil [1] = 13;
        bil [2] = -7;
        bil [3] = 17;

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
        sc.close();
}
}