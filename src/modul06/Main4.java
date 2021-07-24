package modul06;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack list = new Stack();
        int a;
        int m = 0;
        int x = 0;
        int hsl = 0;

        System.out.print("MASUKAN BILANGAN BINER = ");
        Node aa = new Node();
        list.push(aa);
        a = input.nextInt();

        System.out.print("KONVERSI BINER KE DESIMAL = ");
        System.out.println();
        hasil(a,m, x,hsl);
        System.out.println();
    }

    static void hasil(int a, int m, int x,double hsl) {
        int c, e=0;
        int b;
        if( a >= 10) {
            b = a % 10;
        } else {
            b = a;
        }
        if( a > 0) {
            c = (int) (b * Math.pow(2,m));
            hsl = hsl + c;
            if(b!=a) {
                System.out.print(c + " + ");
            } else
                System.out.print(c +" = " + hsl);
            m++;
            hasil(a/10,m, x,hsl);
        }
    }
}


