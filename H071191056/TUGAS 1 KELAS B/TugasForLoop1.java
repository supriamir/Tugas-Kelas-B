import java.util.Scanner;

public class TugasForLoop1{
    public static void main(String[] args){
        
        Scanner raf = new Scanner (System.in);

        System.out.println("Input N: ");
        int n = raf.nextInt();

        System.out.print("Faktor dari bilangan n adalah ");

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
            System.out.print(" " + i);
            }
        }
    }
}