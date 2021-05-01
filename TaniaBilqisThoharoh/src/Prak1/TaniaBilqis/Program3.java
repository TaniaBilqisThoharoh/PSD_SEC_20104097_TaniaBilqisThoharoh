package Prak1.TaniaBilqis;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        //deklarasi variabel
        int a, b, c = 1;
        //outer loop
        for (a = 7; a >= 0; a--) {
            // inner loop
            for (b = 7; b >= a; b--) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}

