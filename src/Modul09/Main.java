package Modul09;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Method_Binary bst = new Method_Binary();
        Scanner s = new Scanner(System.in);

        System.out.println("================> BINARY SEARCH TREE <================");
        System.out.println("1. INSERT");
        System.out.println("2. FIND DIRECTORY");
        System.out.println("3. REMOVE");
        System.out.println("4. FINDMAX");
        System.out.println("5. FINDMIN");
        System.out.println("6. CARI DATA");
        System.out.println("7. GETLEAF");
        System.out.println("8. PRE ORDER");
        System.out.println("IN ORDER");
        System.out.println("POST ORDER");
        System.out.println("======================================================");

        // contoh memanggil isEmpty
        if (bst.isEmpty()) {
            System.out.println();
            System.out.println("Data masih kosong!");
        } else {
            System.out.println();
            System.out.println("Data tidak kosong!");
        }

        // contoh  menggunkana insert
        System.out.println();
        System.out.println("Memasukan data sebanyak 5 kali");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan data : ");
            int data = s.nextInt();
            bst.insert(new Node(data));
        }
        System.out.println();

        // contoh find Directory
        System.out.println();
        System.out.print("Cari data secara direktori : ");
        int data1 = s.nextInt();
        bst.findDirectory(data1);

        // contoh remove
        System.out.println();
        System.out.print("remove data : ");
        int remo = s.nextInt();
        bst.remove(remo);

        System.out.println();
        System.out.println("Nilai maximum : "+ bst.findmax().data);
        System.out.println("Nilai minimum : " + bst.findmin().data);

        // contoh penggunaan find
        System.out.println();
        System.out.print("Cari data : ");
        int cari = s.nextInt();
        bst.find(cari);

        // contoh hasil getLeafCount
        System.out.println();
        System.out.println("Jumlah leaf : " + bst.getLeafCount());

        System.out.println();
        System.out.println("PreOrder Binary Tree" );
        bst.preOrder();
        System.out.println("\nInOrder Binary Tree");
        bst.InOrder();
        System.out.println("\nPostOrder Binary Tree");
        bst.postOrder();
        System.out.println();
    }
}
