package prak2.TaniaBilqis;
import java.util.Arrays;
import java.util.Random;

public class Pro2_MaxSum2 {
    public static int maxSubSum2(int [] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++)
        {

            System.out.println(" Outer Loop");
            int thisSum = 0;
            for (int j = i; j < a.length; j++)
            {
                System.out.println("inner loop 1");

                thisSum += a [j];
                System.out.println("thisSum saat ini = " + thisSum);
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        Random random = new Random();
        int angka3[] = new int[5];
        for (int i = 1; i < angka3.length; i++){
            angka3[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(angka3));
        int maxSum;
        maxSum = maxSubSum2(angka3);
        System.out.println("Max sum is " + maxSum);
        long endTime=System.currentTimeMillis();
        long elapsedtime= endTime - startTime;
        System.out.println("Waktu yang dibutuhkan Running =  "+ String.valueOf(elapsedtime)+ " Detik");
    }
    }
