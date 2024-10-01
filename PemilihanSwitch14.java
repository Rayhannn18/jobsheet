import java.util.Scanner;
public class PemilihanSwitch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double number1, number2, result = 0;
        char operator;

        System.out.println("Masukkan angka 1: ");
        number1 = sc.nextDouble();
        System.out.println("Masukkan angka 2: ");
        number2 = sc.nextDouble();
        System.out.println("Masukkan operator (+ - * :)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
                
            case '-':
                result = number1 - number2;
                break;
                
            case '*':
                result = number1 * number2;
                break;

            case '/':
                result = number1 / number2;
                break;
                
            default:
                System.out.println("Masukkan Operator yang benar !");
                
        }
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/');
           System.out.println(number1 + operator + number2 + " = " + result);
           System.out.println(number1 + " " + operator + " " + number2 + " " + result);

        
    }
}