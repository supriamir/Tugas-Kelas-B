import java.util.Scanner;

public class TugasForLoop3{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);

        System.out.println("Inputan N: ");
        int n = raf.nextInt();

        System.out.print("Banyak Bilangan Ganjil Adalah ");
        int total = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 1 ){
                System.out.print(i + " ");
            }
            total = (i / 2) + 1;
        }
        System.out.println("\nJumlah Bilangan Ganjil Adalah: " + total);
    }
}