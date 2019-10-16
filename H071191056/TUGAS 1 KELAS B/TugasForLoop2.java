import java.util.Scanner;

public class TugasForLoop2{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);

        System.out.println("Input N: ");
        int n = raf.nextInt();

        System.out.print("Banyak bilangan genap adalah: ");
        
        int jumlah = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
            System.out.print(" " + i);

            jumlah += i;

            }
        }
        System.out.println("\nJumlah Bilangan Genap Adalah: " + jumlah);
        
    }
}