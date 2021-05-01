package prak2.TaniaBilqis;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Pro4_MaxSum4 {
    public static int maxSubSum4(int[] a) {
        int maxSum = 0, thisSum = 0;
        for (int j = 0; j < a.length; j++) {
            thisSum += a[j];
            if (thisSum > maxSum)
                maxSum = thisSum;
            else if (thisSum < 0)
                thisSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        long waktuDimulai = Instant.now().toEpochMilli();
        int a[] = new int[1001];

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 999; i++){
            int rand = (int) (Math.random() * range) + min;
            a[i] = rand;
        }


        for (int i = 0; i < 999; i++){
            int rand = (int) (Math.random() * range) + min;
            a [i] = rand;
        }

        for (int element : a){
            System.out.println(element);
        }

        int maxSum;
        maxSum = maxSubSum4(a);
        System.out.println("Max sum adalah " + maxSum);

        long waktuAkhir = Instant.now().toEpochMilli();
        long waktuyangDihabiskan = waktuAkhir - waktuDimulai;

        System.out.println("Waktu untuk menjalankan program dalam milliseconds: " + waktuyangDihabiskan);
    }
}