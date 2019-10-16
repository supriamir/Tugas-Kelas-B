import java.util.Scanner;

class Looping3 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("n = ");
        int n = sl.nextInt();
        System.out.print("Bilangan ganjil = ");
        int odd = 0;

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i);
            System.out.print(i < n ? ", " : "");
            odd += 1;
        }
        System.out.println();
        System.out.println("Banyak bilangan ganjil = " + odd);
    }
}