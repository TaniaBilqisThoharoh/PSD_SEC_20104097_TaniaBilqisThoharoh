package Modul03;

import java.util.Scanner;

public class Prog4_MencariDeret {

    public static long fib4(int n) {
        return fiboHelp(0, 1, n);
    }

    public static long fiboHelp(long x, long y, int n) {
        if (n == 0)
            return x;
        else if (n == 1)
            return y;
        else
            return fiboHelp(y, x + y, n - 1);
    }

    public static int rekursif(int pangkat, int bilangan) {
        if (pangkat == 0) return 1;
        else return bilangan * rekursif(pangkat - 1, bilangan);
    }

    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan Deret Bilangan = ");
        long n = input.nextLong();

        System.out.print(" Hasil Deret = ");


        System.out.println(fib4((int) n));


        double end = System.currentTimeMillis();
        double elapsed = end - start;
        System.out.println(" \n Waktu yang dibutuhkan Running = " + elapsed + " Detik ");
    }
}

