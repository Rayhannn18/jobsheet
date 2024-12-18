package Jobsheet12;
public class Percobaan1 {
    
    public static int faktorRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorRekursif(n - 1);
        }
    }

    public static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = 1; i <= n; i++) {
            faktor *= i;
        }
        return faktor;
    }


    public static void main(String[] args) {
        System.out.println("Faktorial Rekursif dari 5: " + faktorRekursif(5));
        System.out.println("Faktorial Iteratif dari 5: " + faktorialIteratif(5));
    }
}