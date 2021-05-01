package modul02;
import java.lang.Math;
import javax.lang.model.element.Element;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Pro1_MaxSum1 {
    public static int maxSubSum1(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++)
                    thisSum += a[k];
                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        return maxSum;
    }
    public static void main(String [ ] args ) {
        long waktuAwal = Instant.now().toEpochMilli();
        int a[] = new int[1001];
        int maxSum;

        int max = 10;
        int min = 1;
        int range = max - min + 1;


        for (int i = 0; i < 999; i++) {
            int rand = (int) (Math.random() * range) + min;
            a[i] = rand;
        }
        for (int element : a) {
            System.out.println(element);
        }
        maxSum = maxSubSum1(a);
        System.out.println("Max sumis " + maxSum);
        long waktuAkhir = Instant.now().toEpochMilli();

        long waktuyangDihabiskan = waktuAkhir - waktuAwal;
        System.out.println(" Waktu untuk menjalankan program dalam milliseconds: " + waktuyangDihabiskan);
    }
}

