import java.util.Scanner;

public class TugasPP1 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        for (int i = 0; i < 5; i++) {
            int a = input.nextInt();rh5
            int x = input.nextInt();
            if (x % 2 == 0) {
                genap++;
                if (x > 0) {
                    positif++;
                } else if (x < 0) {
                    negatif++;
                }
            } else if (x % 2 != 0) {
                ganjil++;
                if (x > 0) {
                    positif++;
                } else if (x < 0) {
                    negatif++;
                }
            }

        }
        System.out.println(genap + " angka genap ");
        System.out.println(ganjil + " angka ganjil ");
        System.out.println(positif + " angka positif ");
        System.out.println(negatif + " angka negatif ");
    }
}