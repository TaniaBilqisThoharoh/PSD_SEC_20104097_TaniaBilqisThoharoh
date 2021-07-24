package Modul07;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    Queue q = new Queue();


        System.out.println("<======================= QUEUE ====================>");
        System.out.println("<======================= MENU =====================>");
        System.out.println("|1.| Enqueue");
        System.out.println("|2.| Dequeue");
        System.out.println("|3.| Show");
        System.out.println("|4.| MakeEmpty");
        System.out.println("<==================================================>");
        if (q.isEmpty())
                System.out.println("Antrian belum memiliki data !!!");

        System.out.println();
        System.out.print("Masukan Nilai Max Queue = ");
    int m = input.nextInt();
    Queue qq = new Queue(m);

    //Input data
        for (int i = 0; i < qq.max; i ++){
        System.out.println();
        System.out.print("Inputkan Data = ");
        int nim = input.nextInt();
        Node data = new Node(nim);
        qq.Enqueue(data);

        System.out.print("Inputkan Nama = ");
        String nama = input.next();
        Node dataa = new Node(nama);
        qq.Enqueue(dataa);

        System.out.print("Inputkan Alamat = ");
        String alamat = input.next();
        Node dataaa = new Node(alamat);
        qq.Enqueue(dataaa);
    }

        System.out.println();
    //Show
        qq.show();

        System.out.println();
        qq.Dequeue();
        qq.show();

        System.out.println();
    //
        qq.makeEmpty();
        qq.show();

        System.out.println();
    //Mengecek antrian
        if (qq.isEmpty())
                System.out.println("Antrian belum memiliki data!!");
}
}
