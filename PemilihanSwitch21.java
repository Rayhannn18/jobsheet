import java.util.Scanner;

public class PemilihanSwitch21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, result = 0;
        char operator;

        System.out.print("Masukkan angka 1 : ");
        number1 = input.nextDouble();
        System.out.print("Masukkan angka 2 : ");
        number2 = input.nextDouble();
        System.out.print("Masukkan operator (+ - * :) : ");
        operator = input.next().charAt(0);

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
                System.out.println("Masukan operator yang benar !");
        }
        

        input.close();
        if (operator == '-' || operator == '*' || operator == '/' || operator == '+') {
            System.out.println(number1 + operator + number2 + " = " + result);
            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        }

    }

}
