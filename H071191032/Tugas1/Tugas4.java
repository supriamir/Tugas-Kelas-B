import java.util.Scanner;
class Tugas4{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input bilangan : ");
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        for ( int i = 1; i <= 5; i++ ){
            int n = sc.nextInt();
            if ( n % 2 == 0 && n > 0){
                even++;
                pos++;
            } else if ( n % 2 == 0 && n < 0){
                even++;
                neg++;
            } else if ( n % 2 != 0 && n > 0){
                odd++;
                pos++;
            } else if ( n % 2 != 0 && n < 0){
                odd++;
                neg++;
            } else {
                even++;
            }
        }
        System.out.printf("%d bilangan genap \n", even);
        System.out.printf("%d bilangan ganjil \n", odd);
        System.out.printf("%d bilangan positif \n", pos);
        System.out.printf("%d bilangan negatif \n", neg);
    }
}