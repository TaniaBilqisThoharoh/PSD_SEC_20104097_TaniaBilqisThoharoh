package modul06;

public class Stack implements List {
    Node tos;


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(Node input) {
        if (isEmpty()) {//Stack Kosong
            tos = input;//Nilai tos menjadi nilai input
        } else {//Stack isi
            input.nextt = tos;//Pointer next disi nilai tos
            tos = input;// Posisi tos disikan dengan nilai yang di inputkan
            System.out.println("DATA BERHASIL DITAMBAHKAN !! ");
        }
    }

    @Override
    public int pop() {
        if (!isEmpty()) {// Jika stack tidak kosong
            Node temp = tos;// Temp untuk menyimpan nilai tos
            tos = tos.nextt;// Berubah menjadi nilai tos menjadi pointer next
            temp.nextt = null;//
            System.out.println("Yang di POP = " + temp.dataa.toString());//Mengubah data menjadi string
        } else {
            System.out.println("TIDAK BISA KARENA STACK KOSONG");
        }
        return 0;
    }

    @Override
    public void show() {
        if (!isEmpty()) {//Jika stack tidak kosong
            Node temp = tos; // Nilai sementara menjadi tos
            while (temp != null) {
                System.out.print(temp.dataa.toString() + "\n");
                temp = temp.nextt;
            }
        } else {
            System.out.println("STACK KOSONG!!");
        }

    }

    @Override
    public void top(){

    Node temp = tos;//Node temp menyimpan nilai dari tos agar dapat data paling atas
        System.out.println("TOP sekarang = "+temp.dataa);
}

    @Override
    public void topandpop() {
        this.top();// Memanggil method top
        this.pop();// Memanggil method pop

    }

    @Override
    public void makeEmpty() {
        tos = null; // Otomatis di anggap tidak ada data lagii
        System.out.println("Data berhasil dihapus semuaa !!!");
    }
}
