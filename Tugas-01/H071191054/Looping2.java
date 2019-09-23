import java.util.Scanner;

class Looping2 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("n = ");
        int n = sl.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
        sl.close();
    }
}
