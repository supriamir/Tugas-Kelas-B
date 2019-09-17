import java.util.Scanner;
public class Nomor3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        System.out.print("Bilangan Ganjil = ");
        int sum = 0;
        for (int i = 1; i <= N; i+=2) {
            System.out.print(i + " , ");
            sum +=1;
        }
        System.out.println("\nBanyak Bilangan Ganjil = " + sum);
    }
}
