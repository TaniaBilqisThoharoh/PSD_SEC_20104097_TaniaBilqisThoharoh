package Prak1.TaniaBilqis;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double luas, pi = 3.14;
        int jari;

        System.out.print("Inputkan jari jari\t: ");
        jari = input.nextInt();
        luas = pi * jari * jari;
        System.out.println(" Luas lingkaran\t= " + luas);
    }
}
