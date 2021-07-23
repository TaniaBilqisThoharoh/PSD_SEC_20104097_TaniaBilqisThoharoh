package Modul10;

public class Method {

    static int temp, pos, i, j;
    Node head;
    Node tail;

    // Bubble Sort = membandingkan dengan proses berulang
    public static int[] BUBBLESORT(int data[]) {
        // Perulangan yang bertujuan membandingkan data dengan data lainnya
        for (int i = 1; i < data.length; i++) {
            // Lalu pada looping kedua ini digunakan untuk membandingkan mulai dari sebelah kanan
            for (int j = data.length - 1; j >= i; j--) {
                // Data j merupakan data indeks terakhir
                //Jika data J kurang dari data j-1
                if (data[j] < data[j - 1]) {
                    // Terjadi pertukaran dengan temp merupakan penyimpanan sementara
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
        return data;
    }

    //SelectionSort =
    public static int[] SELECTIONSORT(int data[]) {
        // Looping pertama digunakan untuk perulangan awal - akhir
        for (i = 0; i < data.length; i++) {
            pos = i;
            // variabel pos untuk menyimpan indeks dari nilai minimum
            // looping kedua ini untuk mencari nilai minimum di indeks
            for (j = i + 1; j < data.length; j++) {
                // Data pos = data ke i atau 0 untuk peletakan indeks terkecil
                if (data[j] < data[pos]) {
                    pos = j;
                }
            }
            // Membandingkan data
            if (pos != i) {
                // Terjadi pertukaran data
                temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

    public static int[] INSERTIONSORT(int data[]) {
        for (i = 1; i < data.length; i++) {
            temp = data[j];
            j = i;
            while ((j > 0) && (data[j - 1] > temp)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
        return data;
    }

    public boolean ISEMPTY() {
        return head == null;
    }

    public void LENGTH() {
        Node temp = head;
        int i = 0;
        if (ISEMPTY())
            System.out.println("SORT MASIH KOSONG!!");
        else {
            while (temp != null) {
                temp = temp.next;
                i++;
            }
        }
        System.out.println("PANJANG SORT = " + i);
    }

    public void ADD(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void FIND(int cardat){
        int i = 0;
        boolean found = false;
        Node temp = head;
        while (temp != null){
            if (temp.data == cardat){
                found = true;
                System.out.println(cardat +" DITEMUKAN PADA INDEX KE-" + i);
            }
            i++;
            temp = temp.next;
        }
        if (!found){
            System.out.println("DATA TIDAK DITEMUKAN");
        };
    }


    public void PRINTLIST(Node data){
        while(data != null)
        {
            System.out.print(data.data);
            System.out.print(" ");
            data = data.next;
        }
    }

    public void REMOVEFIRST() {
        Node temp = head;
        if (!ISEMPTY()){
            if (head == tail){
                head = tail = null;
            } else {
                head = temp.next;
                temp.next = null;
                temp = null;
            }
        } else {
            System.out.println("LIST KOSONG!!!");
        }
    }

    public void REMOVE(int data){
        try {
            Node temp = head;
            while (temp != null){
                if (temp.next.data == data){
                    temp.next = temp.next.next;
                    System.out.println("DATA " +data+ " BERHASIL DIHAPUS !!!");
                    break;
                } else if (temp.data == data && temp == head){
                    this.REMOVEFIRST();
                    System.out.println("DATA "+data+" BERHASIL DIHAPUS !!!");
                    break;
                } temp = temp.next;
            }
        } catch (Exception e){
            System.out.println("DATA "+data+" TIDAK DITEMUKAN !!!");
        }
    }

    public void add(Node val){
        if (ISEMPTY()){
            head = val;
            tail = val;
        } else {
            val.next = head;
            head = val;
        }
    }
}
