import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args) {
    Scanner nmr = new Scanner(System.in);
    System.out.println("N = ");
    int N = nmr.nextInt();
    System.out.print("Faktor dari " + N + " adalah " + " "); 
    for (int i = 1; i <= N; i++){
        if (N % i ==0) {
            System.out.print(i + "," );
        }
    }   
    }
}