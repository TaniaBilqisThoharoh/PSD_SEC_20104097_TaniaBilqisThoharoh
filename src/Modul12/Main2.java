package Modul12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner bilqis = new Scanner(System.in);

        int[] data = new int[5];
        System.out.println("MASUKAN DATA ARRAY = ");
        for (int i = 0; i < data.length; i++) {
            data[i] = bilqis.nextInt();
        }
        System.out.println();
        System.out.println("<== SEQUENTIAL SEARCH ==>");
        System.out.print("Mencari data = ");
        int teang = bilqis.nextInt();
        System.out.print("Data ditemukan ke = ");
        System.out.println(Searching.sequential(data, teang));
    }
}
