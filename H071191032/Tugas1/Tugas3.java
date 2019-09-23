import java.util.Scanner;
class Tugas3{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input  nilai N --> ");
        int n = sc.nextInt();
        int odd = 0;
        System.out.print("Bilangan ganjil = ");
        for ( int i = 1; i <= n ; i++){
            if ( i % 2 == 1){
                System.out.print( " " + i);
                odd++;
            }
        }
        System.out.println("");
        System.out.println("Banyak bilangan ganjil = " + odd);
    }
}