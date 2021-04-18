package Modul00_LatPrak;

import java.util.Scanner;

public class LatPrak1 {

    public static void main(String[] args) {


        Scanner scann = new Scanner(System.in);
        System.out.print("Masukan bilangan \t:");
        int bil = scann.nextInt();

        for (int c = 1; c <= bil; c++) {
            for (int d = c; d <= c * c; d = d + c) {
//                System.out.print(c);
            }
        }

    }
}
