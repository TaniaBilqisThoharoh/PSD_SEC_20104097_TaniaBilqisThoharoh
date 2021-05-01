package modul01;

public class Program2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 5; j > i; --j) {
                System.out.print(" ");
            }

            for (int k = 1; k < 2 * i; ++k) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

