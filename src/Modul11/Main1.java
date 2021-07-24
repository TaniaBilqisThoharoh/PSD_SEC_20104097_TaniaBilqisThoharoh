package Modul11;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<========================== SORTING II ==========================>");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<============================ MENU ==============================>");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<=========== |1.| QUICKSORT \t\t |2.|MERGESORT ==============>");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<===========\t\t\t\t|3.|EXIT\t\t\t\t ============>");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<=====SILAHKAN MEMILIH MENU =====>");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMENU YANG DIPILIH = ");
        int PilMen = input.nextInt();

        switch (PilMen) {
            case 1:
                long awal = System.currentTimeMillis();

                Random angkaRandom = new Random();

                int[] array = new int[100];

                for (int i = 0; i < array.length; i++) {
                    int index = angkaRandom.nextInt(100);
                    array[i] = index;
                }

                //int[]array = RANDOMARRAY(100);

                System.out.println();
                // Contoh Run Quicksort
                System.out.println("<===================================================================================================================================================== QUICKSORT ======================================================================================================================================================>");
                System.out.print("ARRAY SEBELUM DI SORT = ");
                Quick.PRINTARRAY(array);

                System.out.print("ARRAY SETELAH DI SORT = ");
                Quick.QUICKSORT(array, 0, array.length - 1);
                Quick.PRINTARRAY(array);
                System.out.println("<======================================================================================================================================================================================================================================================================================================================>");
                System.out.println();

                long akhir = System.currentTimeMillis();
                double hasil = akhir - awal;
                System.out.print("WAKTU RUNNING = " + hasil);
                break;

            case 2:
                long awall = System.currentTimeMillis();

                Random angkaRandoMer = new Random();

                int[] arrayMer = new int[100];

                for (int i = 0; i < arrayMer.length; i++) {
                    int index = angkaRandoMer.nextInt(100);
                    arrayMer[i] = index;
                }

                //int[]array = RANDOMARRAY(100);

                System.out.println();
                // Contoh Run Quicksort
                System.out.println("<===================================================================================================================================================== MERGESORT ======================================================================================================================================================>");
                System.out.print("ARRAY SEBELUM DI SORT = ");
                Marge.PRINTARRAY(arrayMer);

                System.out.print("ARRAY SETELAH DI SORT = ");
                Marge.MERGESORTT(arrayMer, 0, arrayMer.length - 1);
                Marge.PRINTARRAY(arrayMer);
                System.out.println("<======================================================================================================================================================================================================================================================================================================================>");
                System.out.println();

                long akhirr = System.currentTimeMillis();
                double hasill = akhirr - awall;
                System.out.print("WAKTU RUNNING = " + hasill);
                break;
        }
    }
}