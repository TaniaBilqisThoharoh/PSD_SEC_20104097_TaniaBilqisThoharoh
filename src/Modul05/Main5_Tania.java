package Modul05;

import java.util.Scanner;

public class Main5_Tania {
    public static void main(String[] args) {
        Double_LL listania = new Double_LL();
        Scanner masukan = new Scanner(System.in);

        System.out.println("_____________________");
        System.out.println("||<<================= DOUBLE LINKEDLIST =================>>||");
        System.out.println("_____________________");
        System.out.println();
        System.out.println("||<<========================= MENU ======================>>||");
        System.out.println(" 1. AddFirst        || 2. AddLast      || 3. InsertAfter    ||");
        System.out.println(" 4. InsertBefore    || 5. Insert       || 6. Replace Data   ||");
        System.out.println(" 7. Remove AwalAkhir|| 8. Mencari Data || 9. Remove At      ||");
        System.out.println("                 || 10. Remove All   ||");
        System.out.println("||<<=====================================================>>||");

        System.out.println("Contoh addFirst");
        for (int i = 0; i < 3; i++) {
            System.out.print("Inputkan data : ");
            int input = masukan.nextInt();
            Node obj = new Node(input);
            listania.addFirst(obj);
        }listania.show();

        System.out.println("\nContoh addLast");
        for (int i = 0; i < 3; i++) {
            System.out.print("Inputkan data : ");
            int input = masukan.nextInt();
            Node obj = new Node(input);
            listania.addLast(obj);
        }listania.show();


        System.out.println("\nContoh removeFirst");
        listania.removeFirst();
        listania.show();
        System.out.println("\nContoh removeLast");
        listania.removeLast();
        listania.show();


        System.out.println("\nContoh menggunakan insert");
        for (int i = 0; i < 2; i++) {
            System.out.print("Inputkan lokasi index : ");
            int index = masukan.nextInt();
            System.out.print("Inputkan datanya : ");
            int input = masukan.nextInt();
            Node obj = new Node(input);
            listania.insert(index, obj);
        }listania.show();

        System.out.println("\nContoh replace");
        for (int i = 0; i < 1; i++) {
            System.out.print("Inputkan data yang ingin diganti: ");
            int data1 = masukan.nextInt();
            System.out.print("Inputkan data baru : ");
            int data2 = masukan.nextInt();
            Node obj1 = new Node(data1);
            Node obj2 = new Node(data2);
            listania.replace(obj1, obj2);
        }listania.show();

        System.out.println("\nContoh remove");
        System.out.print("Inputkan data yang ingin dihapus : ");
        int remove = masukan.nextInt();
        Node objRemove = new Node(remove);
        listania.remove(objRemove);
        listania.show();

        System.out.println("\nContoh removeAt");
        System.out.print("Inputkan index data yang ingin dihapus : ");
        int removeIndex = masukan.nextInt();
        listania.removeAt(removeIndex);
        listania.show();

        System.out.println("\nHasil showReversed");
        listania.showreversed();

        System.out.println("\ncontoh find");
        System.out.print("Cari data : ");
        int cari = masukan.nextInt();
        Node objCari = new Node(cari);
        listania.find(objCari);

        // memberi output panjang list
        System.out.println();
        listania.length();

        // menghapus list
        System.out.println();
        listania.clear();

        // mengecek apakah list kosong atau tidak setelah dihapus
        if (listania.isEmpty())
            System.out.println("\nList sudah kosong!");
    }
    }

