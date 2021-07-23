package Modul11;

public class Quick {

    static void QUICKSORT(int[] a, int low, int high){
        // Method ini akan dipanggil pada kelas main
        // Terdapat rekursif
        if (low < high){
            //Pi itu partition index
            int pi = PARTITION(a, low, high);// Nanti data akan di split
            //2 Rekursif
            QUICKSORT(a, low,  pi-1);// Minus pivot diurutkan terlebih dulu
            QUICKSORT(a, pi+1, high);// Seluruh data termasuk pivot
        }
    }

    // Method untuk proses partisinya
    private static int PARTITION(int[] a, int low, int high){
        int pivot = a[high];// Menggunakan pivot data terakhir
        int i = (low-1);    //

        for (int j = low; j <= high-1; j++){
            // pertukaran berdasarkan pivot
            if (a[j] < pivot){
                i++;            // Jika data ke j kurang dari pivot maka akan dismpan di kiri
                SWAP(a, i, j);  // Namun jika lebih besar dari pivot maka akan disimpan di kanan
            }
        }
        SWAP(a, i+1, high);
        return (i+1);
    }


    // Method untuk proses swap
    private static void SWAP(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //Method mencetak array
    static void PRINTARRAY(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
