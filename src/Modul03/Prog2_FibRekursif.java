package Modul03;

import java.util.Scanner;

public class Prog2_FibRekursif {
    public static long fib2(int n){
        if (n<=1)
            return n;
        else return fib2(n-1) + fib2(n-2);
    }

    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan Deret Bilangan = ");
        long n = input.nextLong();

        System.out.print(" Hasil Deret = ");


        System.out.println(fib2((int) n));


        double end = System.currentTimeMillis();
        double elapsed = end - start;
        System.out.println(" \n Waktu yang dibutuhkan Running = " + elapsed + " Detik ");
    }
}
