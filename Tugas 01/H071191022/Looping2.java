import java.util.Scanner;
public class Looping2 {

    public static void main(String[] args) {
        Scanner looping = new Scanner (System.in);
        System.out.print("N = ");
        int N = looping.nextInt();
        int sum = 0;
        for (int i = 1; i<=N; i++){
            if (N%i==0){
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}