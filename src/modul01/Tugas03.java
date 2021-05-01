package modul01;

public class Tugas03 {
    public Tugas03() {
    }

    public static void main(String[] args) {
        int angka = 1;

        for (int a = 3; a >= 0; --a) {
            for (int b = 3; b >= a; --b) {
                if (a == 0 && b == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(angka + " ");
                }

                ++angka;
            }

            System.out.println();
        }
    }
}
