package modul01;

public class Program3 {
    public static void main(String[] args) {
        boolean c = true;

        for (int a = 7; a >= 0; --a) {
            for (int b = 7; b >= a; --b) {
                System.out.print(b + " ");
            }

            System.out.println();
        }

    }
}
