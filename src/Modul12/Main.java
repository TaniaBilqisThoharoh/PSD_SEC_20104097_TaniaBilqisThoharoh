package Modul12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tania = new Scanner(System.in);


        System.out.println(" BINARY SEARCH ");
        int[] data = new int[5];
        System.out.println("MASUKAN DATA ARRAY = ");
        for (int i = 0; i < data.length; i++) {
            data[i] = tania.nextInt();
        }

        System.out.println();
        System.out.print("DATA SEBELUM DISORTING = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
        System.out.print("DATA SESUDAH DISORTING = ");
        Searching.selectionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println(" BINARY SEARCH ");
        System.out.print("MENCARI DATA = ");
        int teang = tania.nextInt();

        System.out.print("DATA DITEMUKAN KE- ");
        System.out.println(Searching.binarySearch(data, teang));
        System.out.println();
    }
}
