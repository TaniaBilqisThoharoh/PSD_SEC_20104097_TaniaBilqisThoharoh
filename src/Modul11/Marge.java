package Modul11;

public class Marge {

    // Method yang digunakan untuk dipanggil di kelas Main
    // Berisikan 2 Rekursif
    public static void MERGESORTT(int a[], int left, int right){
        if (left < right){
            // Variable Middle untuk membagi 2 array
            int middle = left + (right - left) / 2;
            // Rekursif atas untuk data 0 - middle
            MERGESORTT(a, left, middle);
            // Rekursif bawah untuk data middle + 1 sampai terakhir
            MERGESORTT(a, middle + 1, right);
            // Melakukan merge dan sort
            MERGE(a, left, middle, right);
        }
    }

    private static void MERGE(int[] a, int left, int middle, int right){
        // Variabel untuk menentukan array pada proses merge
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Array bantuan
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Proses menyalin data ke array bantuan
        for (int i = 0; i < n1; i++){
            L[i] = a[left + i];
        }
        for (int i = 0; i < n2; i++){
            R[i] = a[middle + 1 + i];
        }

        // Merge & Sort
        int i = 0, j = 0;

        int k = left;

        while (i < n1 && j < n2){
            // Kalau data di L ke-i lebih kecil dari R ke-j
            // Maka masukan data ke array utama
            if (L[i] <= R[j]){
                a[k] = L[i];  // Data akan dimasukin ulang
                i++;
            }
            // Jika sebaliknya maka masukan data R ke array utama
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        // Jika ada sisa element yang tertinggal di L[]
        while (i < n1){
            a[k] = L[i];
            i++;
            k++;
        }
        // Jika ada sisa elemtn yang tertinggal di R[]
        while (j < n2){
            a[k] = R[j];
            j++;
            k++;
        }
    }

    // Untuk mencetak array
    public static void PRINTARRAY(int a[]){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int RANDOMINT(int low, int high) {
        double e;
        double x = Math.random();
        e = low + x * (high-low);
        return (int) e;
    }

    public static int[] RANDOMARRAY(int sorting) {
        int[]array = new int[sorting];
        for(int i = 0; i < array.length; i++) {
            array[i] = RANDOMINT(0, 100);
        }
        return array;
    }
}
