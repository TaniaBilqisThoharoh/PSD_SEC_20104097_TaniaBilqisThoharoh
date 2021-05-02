package Modul03;

import java.util.Scanner;

public class Prog3_Fib3 {

    public static long fib3(int n)
    {
        if(n<=1)
            return n;
        long fib1 = 0;
        long fib2 = 1;
        long result = 0;
        for(int ii = 2; ii<=n; ii++)
        {
            result = fib2 + fib1;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan Deret Bilangan = ");
        long n = input.nextLong();

        System.out.print(" Hasil Deret = ");


        System.out.println(fib3((int) n));


        double end = System.currentTimeMillis();
        double elapsed = end - start;
        System.out.println(" \n Waktu yang dibutuhkan Running = " + elapsed + " Detik ");
    }
}
