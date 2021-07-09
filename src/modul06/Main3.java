package modul06;

import java.util.Scanner;


public class Main3 {

    public static void main(String[] args) {
        Stack stacktania = new Stack();
        Scanner scan = new Scanner(System.in);

        int code;
        boolean stop = false;
        do {
            System.out.println("Stack");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. show");
            System.out.println("4. makeEmpty");
            System.out.println("5. top");
            System.out.println("6. topAndPop");
            System.out.println("0. Keluar");

            System.out.print("\n> ");
            code = scan.nextInt();
            System.out.println();

            Node input;
            int read;
            switch (code) {
                case 1:
                    System.out.print("Masukkan angka\t: ");
                    read = scan.nextInt();
                    input = new Node(read);
                    stacktania.push(input);
                    break;
                case 2:
                    stacktania.pop();
                    break;
                case 3:
                    stacktania.show();
                    break;
                case 4:
                    stacktania.makeEmpty();
                    break;
                case 5:
                    stacktania.top();
                    break;
                case 6:
                    stacktania.topandpop();
                    break;
                case 0:
                    stop = true;
                    break;
                default:
                    System.out.println("[EROR] Kode tidak dikenal!");
            }
        } while (!stop);
    }
}
