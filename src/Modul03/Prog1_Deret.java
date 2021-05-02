package Modul03;

import java.util.Scanner;

public class Prog1_Deret {

    public static long fib1(long Num){
        if (Num == 0)
            return 0;
        else if (Num == 1)
            return 1;
        else{
            long x = 0;
            long y = 1;
            for(long k =2; k<=Num; k++){
                y = x + y;
                x = y - x;
            }
            return y;
        }
    }



    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan Deret Bilangan = ");
        long n = input.nextLong();

        System.out.print(" Hasil Deret = ");


        System.out.println(fib1((int) n));


        double end = System.currentTimeMillis();
        double elapsed = end - start;
        System.out.println(" \n Waktu yang dibutuhkan Running = " + elapsed + " Detik ");
    }
}
