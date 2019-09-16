import java.util.Scanner;

class Looping1 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Input suatu bilangan : ");
        int n = sl.nextInt();
        sl.close();
        System.out.println("Faktor dari" + n + "adalah");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(i < n ? ", " : "");
            }
        }
        System.out.println();
    }
}