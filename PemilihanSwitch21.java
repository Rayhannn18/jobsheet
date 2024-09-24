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

        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            result = number1 / number2;
        } else {
            System.out.println("Operator yang anda masukan salah");
        }
        input.close();

        if (operator == '-' || operator == '*' || operator == '/' || operator == '+') {
            System.out.println(number1 + operator + number2 + " = " + result);
            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        }

    }

}
