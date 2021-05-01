package Prak1.TaniaBilqis;

import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        int a, b;
        int angka = 1;

        // outer loop
        for (a = 3; a >= 0; a--) {
            // inner loop
            for (b = 3; b >= a; b--) {
                if (a == 0 && b == 0) {
                    System.out.print(0);
                }else {
                    System.out.print(angka + " ");

                }
                angka++;

            }
            System.out.println();
        }
    }
}
