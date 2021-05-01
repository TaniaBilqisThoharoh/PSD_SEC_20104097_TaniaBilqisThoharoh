package modul01;

import java.util.Scanner;

public class Program4 {
    public Program4() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14D;
        System.out.print("Inputkan jari jari\t: ");
        int jari = input.nextInt();
        double luas = pi * (double)jari * (double)jari;
        System.out.println(" Luas lingkaran\t= " + luas);
    }
}
