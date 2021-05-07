package Modul4;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Linkedlist link = new Linkedlist();

        for (int i = 0; i < 3; i++) {
            Node obj = new Node();
            System.out.println("\n ADDFIRST "); // benar
            System.out.print("MASUKAN DATA = ");
            int input = scan.nextInt();
            obj.data = input;
            link.addFirst(obj);
            link.printNode();
        }
        // ADDLAST
        for (int i = 0; i < 3; i++) {
            Node obj = new Node();
            System.out.println("\n ADDLAST "); // benar
            System.out.print(" MASUKAN DATA = ");
            int input = scan.nextInt();
            obj.data = input;
            link.addLast(obj);
            link.printNode();
        }
        // INSERT AFTER
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println();
            System.out.println("INSERT AFTER");
            System.out.print("MASUKAN KEY = ");
            int key = scan.nextInt();
            System.out.print("MASUKAN DATA = ");
            int input = scan.nextInt();
            obj.data = input;
            link.insertAfter(key, obj);
            link.printNode();
        }
        // INSERT BEFORE
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println();
            System.out.println("INSERT BEFORE");
            System.out.print("MASUKAN KEY = ");
            int key = scan.nextInt();
            System.out.print("MASUKAN DATA = ");
            obj.data = scan.nextInt();
            System.out.println();
            link.insertBefore(key, obj);
            link.printNode();
        }
        // INSERT INDEX
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println();
            System.out.println("INSERT");
            System.out.print("MASUKAN INDEX = ");
            int index = scan.nextInt();
            System.out.print("MASUKAN DATA = ");
            int input = scan.nextInt();
            obj.data = input;
            System.out.println();
            link.insert(index, obj);
            link.printNode();
        }
        // REPLACE
        for (int i = 0; i < 1; i++) {
            System.out.println();
            System.out.println("REPLACE DATA");
            System.out.print("INPUT DATA YANG INGIN DIGANTI =  ");
            int data1 = scan.nextInt();
            System.out.print("INPUT DATA BARU = ");
            int data2 = scan.nextInt();
            link.replace(data1, data2);
            link.printNode();
        }
        //REMOVE
        System.out.println();
        System.out.println("REMOVE");
        System.out.print("Input Data Yang Akan Diremove = ");
        int hapus = scan.nextInt();
        link.remove(hapus);
        link.printNode();

        // REMOVEFIRST
        System.out.println();
        {
            System.out.println("REMOVE DATA AWAL");
            link.removeFirst();
            link.printNode();
        }

        // REMOVE LAST
        System.out.println();
        {
            System.out.println("REMOVE DATA AKHIR");
            link.removeLast();
            link.printNode();
        }

        // FIND
        System.out.println();
        System.out.println("MENCARI DATA");
        System.out.print("Masukan Data Yang Ingin Dicari = ");
        int cari = scan.nextInt();
        link.find(cari);
        link.printNode();

        // REMOVE AT
        System.out.println();
        System.out.println("REMOVE AT");
        System.out.println("Panjang data  = ");
        link.printNode();
        System.out.print("Masukan data yang akan dihapus = ");
        int removeat = scan.nextInt();
        link.removeAt(removeat);


        // REMOVE ALL
        System.out.println();
        System.out.println("Remove all");
        link.clear();
        link.printNode();

    }
}
