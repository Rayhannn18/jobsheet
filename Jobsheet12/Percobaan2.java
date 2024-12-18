package Jobsheet12;
import java.util.Scanner;
public class Percobaan2 {
    public static int hitungPangkat(int angka_pertama,int angka_kedua ){
        if(angka_kedua==0){
            return 1;
        }else{
            return (angka_pertama * hitungPangkat(angka_pertama,angka_kedua-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bilangan yang dihitung");
        int bilangan = input.nextInt();
        System.out.println("Bilangan yang dihitung");
        int pangkat = input.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}