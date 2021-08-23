package Modul05;

public class Double_LL implements List {
    // Deklarasi obj untuk node head dan tail
    Node head;
    Node tail;


    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            // head.kiri agar head punya pointer ke arah input
            head.kiri = input;
            // input.kanan agar input punya pointer ke arah head
            input.kanan = head;
            head = input;
        }

    }

    @Override
    public void addLast(Node input) {
        if (isEmpty()) {
            head = tail;
            tail = head;
        } else {
            tail.kanan = input;
            input.kiri = tail;
            tail = input;
        }

    }

    @Override
    public void insertAfter(Node key, Node input) {
        Node temp = head;
        boolean found = false;
        do {
            if (temp.data == key) {
                input.kanan = temp.kanan;
                temp.kanan = input;
                found = true;
                System.out.println("Memasukan Data " + input.data + " Setelah data " + key + "Sukses!!");
                break;
            }
            temp = temp.kanan;
        }
        while (temp != null);
        if (!found) {
            System.out.println("Data " + key + " ");

        }

    }

    public void insertBefore(Node key, Node input) {
        try {
            Node temp = head;
            while (temp != null){
                if ((temp.data == key) && (temp == head)){
                    this.addFirst(input);
                    System.out.println("Memasukan data "+ input.data +" Sebelum data "+ key +"Sukses !!");
                    break;
                } else if (temp.kiri.data == key){
                    input.kiri = temp.kiri;
                    temp.kiri = input;
                    System.out.println("Memasukan data "+ input.data +" Sebelum data "+ key +"Sukses !!");
                    break;
                }
                temp = temp.kiri;
            }
        } catch (Exception e){
            System.out.println("Data "+ key +"Tidak ditemukan !!");
        }
    }

    public void insert(int index, Node input) {
        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null) {
            if (index == 0) {
                this.addFirst(input);
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukkan pada index" + " ke-" + index);
                break;
            } else if (i == index - 1 && temp != tail) {
                input.kanan = temp.kanan;
                temp.kanan.kiri = input;
                input.kiri = temp;
                temp.kanan = input;
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukkan pada index " + "ke-" + index);
                break;
            } else if (i == index - 1 && temp == tail) {
                this.addLast(input);
                found = true;
                System.out.println("Data " + input.data + " berhasil dimasukkan pada index " + "ke-" + index);
                break;
            }
            temp = temp.kanan;
            i++;
        }
        if (!found)
            System.out.println("index " + index + " out of bound!");
    }

    public void replace(Node data1, Node data2) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data == data1.data) {
                temp.data = data2.data;
                found = true;
                System.out.println("Data " + data1.data + " berhasil diganti dengan data " +
                        data2.data);
                break;
            }
            temp = temp.kanan;
        }
        if (!found)
            System.out.println("Data tidak ditemukan!");
    }

    public void remove(Node data) {
        try {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data.data && temp == tail) {
                    this.removeLast();
                    System.out.println("Data " + data.data + " berhasil dihapus!");
                    break;
                } else if (temp.data == data.data && temp == head) {
                    this.removeFirst();
                    System.out.println("Data " + data.data + " berhasil dihapus!");
                    break;
                } else if (temp.kanan.data == data.data && temp.kanan != tail) {
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data " + data.data + " berhasil dihapus!");
                    break;
                }
                temp = temp.kanan;
            }
        } catch (Exception e) {
            System.out.println("Data " + data.data + " tidak ditemukan!");
        }
    }

    public void removeAt(int index) {
        Node temp = head;
        int i = 0;
        try {
            while (temp != null) {
                if (index == 0) {
                    this.removeFirst();
                    System.out.println("Data awal berhasil dihapus");
                    break;
                } else if (i == index - 1 && temp.kanan != tail) {
                    temp.kanan = temp.kanan.kanan;
                    temp.kanan.kiri = temp;
                    System.out.println("Data pada index " + index + " berhasil dihapus!");
                    break;
                } else if (i == index - 1 && temp.kanan == tail) {
                    this.removeLast();
                    System.out.println("Data terakhir berhasil dihapus");
                    break;
                }
                temp = temp.kanan;
                i++;
            }
        } catch (Exception e) {
            System.out.println("Index " + index + " out of bound");
        }
    }

    public void removeFirst() {
        Node temp = head;
        if (isEmpty())
            System.out.println("List masih kosong");
        else {
            if (head == tail)
                head = tail = null;
            else {
                head = temp.kanan;
                head.kiri = null;
                temp.kanan = null;
                temp = null;
            }
        }
    }

    public void removeLast() {
        Node temp = tail;
        if (isEmpty())
            System.out.println("List kosong");
        else {
            if (tail == head)
                head = tail = null;
            else {
                tail = tail.kiri;
                tail.kanan = null;
                temp.kiri = null;
                temp = null;
            }
        }
    }

    public void clear() {
        if (isEmpty())
            System.out.println("List kosong!");
        else {
            // disini menjadikan head dan tail = null
            head = null;
            tail = null;
            System.out.println("Data berhasil dihapus semua!");
        }
    }

    public void show() {
        Node temp = head;
        if (isEmpty()) {
            System.out.println("Data kosong!");
        } else {
            while (temp != null) {
                System.out.print("|"+temp.data +"| ");
                temp = temp.kanan;
            }
        }
        System.out.println();
    }

    public void showreversed() {
        Node temp = tail;
        if (isEmpty())
            System.out.println("List kosong!");
        else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.kiri;
            }
            System.out.println();
        }
    }

    public void find(Node data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == data.data) {
                found = true;
                break;
            }
            i++;
            temp = temp.kanan;
        }
        if (found) {
            System.out.println(data.data + " ditemukan pada index ke-" + i);
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public int length() {
        Node temp = head;
        int i = 0;
        if (isEmpty())
            System.out.println("List kosong!");
        else {
            while (temp != null) {
                temp = temp.kanan;
                i++;
            }
        }
        System.out.println("Panjang data : " + i);
        return i;
    }

    public boolean checking(Node input) {
        Node temp = head;
        while (temp != null){
            if (temp.data == input.data){
                return true;
            }
            temp = temp.kanan;
        }
        return false;
    }
}
