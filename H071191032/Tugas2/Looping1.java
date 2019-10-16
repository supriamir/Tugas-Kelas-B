 import java.util.Scanner;
 class Looping1{
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.print("Base = ");
         int base = input.nextInt();
         System.out.print("Pangkat = ");
         int pangkat = input.nextInt();
         int pow = 1;

         if ( pangkat > 0){
            for ( int i = 1; i <= pangkat; i++){
                pow = pow * base;
            }
            System.out.printf("%d ^ %d = %d", base, pangkat, pow) ;
         } else if ( pangkat < 0 ){
             for ( int i = -1; i >= pangkat ; i--){
                pow = pow * base;
             } 
             System.out.printf("%d ^ %d = 1/%d", base, pangkat, pow);
         } else{
             for ( int i = 1 ; 1 <= pangkat; i++){
                 pow = pow * 1;
             }
             System.out.printf("%d ^ %d = %d",base, pangkat, pow);
         }
    }
 }