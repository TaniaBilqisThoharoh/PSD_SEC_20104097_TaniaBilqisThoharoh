package modul0;

import java.util.Scanner;

public class LatPrakSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suhu;
        System.out.print("Masukkan suhu \t: ");
        suhu = scanner.nextInt();
        //pengecekan terhadap suhu
        if (suhu >= 0){
            System.out.println("suhu "+ "derajat celcius, air akan berwujud es ");
        }else if(suhu > 0 && suhu < 100){
            System.out.println("suhu "+ "derajat celcius, air akan berwujud air ");
        }else {
            System.out.println("suhu "+ "derajat celcius, air akan berwujud gas ");
        }

    }
}
