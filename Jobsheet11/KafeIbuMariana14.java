package Jobsheet11;
import java.util.Scanner;
public class KafeIbuMariana14 {
    
    private static final String[] menuNames = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main(String[] args) {
        int[][] salesData = {
                {20, 20, 25, 20, 10, 60, 10}, 
                {30, 80, 40, 10, 15, 20, 25}, 
                {5,  9,  20, 25, 10, 5,  45},    
                {50, 8,  17, 18, 10, 30, 6},   
                {15, 10, 16, 15, 10, 10, 55}  
        };
        displaySalesData(salesData);
        String highestSellingMenu = findHighestSellingMenu(salesData);
        System.out.println("\nMenu with highest sales: " + highestSellingMenu);
        double[] averageSales = calculateAverageSales(salesData);
        for (int i = 0; i < menuNames.length; i++) {
            System.out.printf("Average sales for %s: %.2f\n", menuNames[i], averageSales[i]);
        }
    }

    public static void displaySalesData(int[][] salesData) {
        System.out.println("\nSales Data:");
        System.out.println("Day\tKopi\tTeh\tEs Degan\tRoti Bakar\tGorengan");
        for (int day = 0; day < 7; day++) {
            System.out.print((day + 1) + "\t");
            for (int menu = 0; menu < 5; menu++) {
                System.out.print(salesData[menu][day] + "\t");
            }
            System.out.println();
        }
    }

    public static String findHighestSellingMenu(int[][] salesData) {
        int[] totalSales = new int[5];
        for (int day = 0; day < 7; day++) {
            for (int menu = 0; menu < 5; menu++) {
                totalSales[menu] += salesData[menu][day];
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return menuNames[maxIndex];
    }

    public static double[] calculateAverageSales(int[][] salesData) {
        double[] averageSales = new double[5];
        for (int menu = 0; menu < 5; menu++) {
            int total = 0;
            for (int day = 0; day < 7; day++) {
                total += salesData[menu][day];
            }
            averageSales[menu] = (double) total / 7;
        }
        return averageSales;
    }
}