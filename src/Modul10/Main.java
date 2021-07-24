package Modul10;

import java.util.Scanner;

public class Main {

    public static void printPilihan() {
        System.out.println();
        System.out.print("Pilihan Anda :\n"
                + "1.  Bubble Sort\n"
                + "2.  Selection Sort\n"
                + "3.  Insertion Sort\n"
                + "4.  Keluar\n"
                + "Silahkan masukkan pilihan Anda : ");
    }

    static int temp, i, j;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Method Tania = new Method();

        int a[];

        printPilihan();
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("<== BUBBLE SORT ==>");
                if (Tania.ISEMPTY()){                             // isEmpty Linkedlist
                    System.out.println("DATA KOSONG");
                } else {
                    System.out.println("DATA TERISI");
                }
                System.out.println();
                System.out.print("MASUKAN JUMLAH DATA : ");
                int jumdata = input.nextInt();

                a = new int[jumdata];

                System.out.println();
                for (int i = 0; i < a.length; i++) {
                    System.out.print("MASUKAN DATA KE-" + (i) + " : ");
                    a[i] = input.nextInt();
                    Tania.ADD(a[i]);
                }

                System.out.println();
                System.out.print("DATA SEBELUM DISORTING : ");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.print("\nDATA SESUDAH DISORTING : ");
                Method.BUBBLESORT(a);
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.println();
                System.out.println();
                Method.BUBBLESORT(a);
                Tania.LENGTH();                                 // LENGTH Linkedlist

                System.out.println();
                System.out.println("\n<= REMOVE FIRST =>");
                Tania.REMOVEFIRST();
                Tania.PRINTLIST(Tania.head);

                System.out.println();
                System.out.println();
                System.out.print("HAPUS DATA = ");            // HAPUS linked
                int hapusBub = input.nextInt();
                Tania.REMOVE(hapusBub);

                Method.BUBBLESORT(a);

                System.out.println();
                System.out.print("Sisa Data = ");
                Tania.PRINTLIST(Tania.head);
                break;

            case 2:
                System.out.println("<== SELECTION SORT ==>");
                if (Tania.ISEMPTY()){                             // isEmpty Linkedlist
                    System.out.println("DATA KOSONG");
                } else {
                    System.out.println("DATA TERISI");
                }
                System.out.println();
                System.out.print("MASUKAN JUMLAH DATA : ");
                int jumdatasale = input.nextInt();

                a = new int[jumdatasale];

                System.out.println();
                for (int i = 0; i < a.length; i++) {
                    System.out.print("MASUKAN DATA KE-" + (i) + " : ");
                    a[i] = input.nextInt();
                    Tania.ADD(a[i]);
                }

                System.out.println();
                System.out.print("DATA SEBELUM DISORTING : ");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.print("\nDATA SESUDAH DISORTING : ");
                Method.SELECTIONSORT(a);
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.println();
                System.out.println();
                Method.SELECTIONSORT(a);
                Tania.LENGTH();                                 // LENGTH Linkedlist

                System.out.println();
                System.out.println("\n<= REMOVE FIRST =>");
                Tania.REMOVEFIRST();
                Tania.PRINTLIST(Tania.head);

                System.out.println();
                System.out.println();
                System.out.print("HAPUS DATA = ");            // HAPUS linked
                int hapussale = input.nextInt();
                Tania.REMOVE(hapussale);

                Method.SELECTIONSORT(a);

                System.out.println();
                System.out.print("Sisa Data = ");
                Tania.PRINTLIST(Tania.head);
                break;

            case 3:
                System.out.println("<== INSERT SORT ==>");
                if (Tania.ISEMPTY()){                             // isEmpty Linkedlist
                    System.out.println("DATA KOSONG");
                } else {
                    System.out.println("DATA TERISI");
                }
                System.out.println();
                System.out.print("MASUKAN JUMLAH DATA : ");
                int jumdatain = input.nextInt();

                a = new int[jumdatain];

                System.out.println();
                for (int i = 0; i < a.length; i++) {
                    System.out.print("MASUKAN DATA KE-" + (i) + " : ");
                    a[i] = input.nextInt();
                    Tania.ADD(a[i]);
                }

                System.out.println();
                System.out.print("DATA SEBELUM DISORTING : ");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.print("\nDATA SESUDAH DISORTING : ");
                Method.INSERTIONSORT(a);
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.println();
                System.out.println();
                Method.INSERTIONSORT(a);
                Tania.LENGTH();                                 // LENGTH Linkedlist

                System.out.println();
                System.out.println("\n<= REMOVE FIRST =>");
                Tania.REMOVEFIRST();
                Tania.PRINTLIST(Tania.head);

                System.out.println();
                System.out.println();
                System.out.print("HAPUS DATA = ");            // HAPUS linked
                int hapus = input.nextInt();
                Tania.REMOVE(hapus);

                Method.INSERTIONSORT(a);

                System.out.println();
                System.out.print("Sisa Data = ");
                Tania.PRINTLIST(Tania.head);
                break;


        }
    }
}
