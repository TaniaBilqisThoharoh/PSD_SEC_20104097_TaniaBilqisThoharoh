package Modul07;

public class Queue {

    //Deklarasi Node
    Node depan, belakang;
    int max, size;
    int que[];

    public Queue() {
    }

    public Queue(int m) {
        max = m;
        create();
    }

    void create() {
        que = new int[max];
        size = 0;
    }

    //Method isEmpty
    boolean isEmpty() {
        return (depan == null);//untuk mengecek is empty dengan boolean
    }

    //Method Enqueue (menambah data pada antrian)
    //Mirip dengan addlast pada single linked list
    void Enqueue(Node input) {
        if (isEmpty()) {
            depan = input;
            belakang = input;
        } else { //Dan jika sudah ada datanya maka di input mulai dari belakang
            belakang.next = input;
            belakang = belakang.next;
        }
    }

    //Method Dequeue (mengeluarkan data dari antrian)
    //Mirip seperti removefirst pada single linked list
    void Dequeue() {
        if (isEmpty())
            System.out.println("Dequeue gagal, Antrian masih kosong !!!");
        else {
            Node temp = depan;
            System.out.println(temp.data + " Berhasil Dequeue!!");
            if (depan == belakang) {
                depan = belakang = null;
            } else {
                depan = depan.next;//Diarahkan ke node selanjutnya
            }
        }
    }

    // Untuk menampilkan antrian saat ini
    void show() {
        if (!isEmpty()) {
            Node temp = depan;
            System.out.println("Antrian saat ini : ");
            while (temp != null) {

                System.out.print("|" + temp.data + "| ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Antrian masih kosong  !!!");
        }
    }

    void makeEmpty() {
        depan = null;
        belakang = null;
        System.out.println("Data Queue behasil dikosongkan !!!");
    }
}
