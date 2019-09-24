import java.util.Scanner;
class Persamaan{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1. y = 4x +1");
        System.out.println("2. y = x^1/2 -1");
        System.out.println("3. y = 5x^2 + 3x - 2 ");
        System.out.print("Masukkan inputan sesuai angka yang dipilih : ");
        int option = sc.nextInt();
        sc.close();

        switch(option){
            case 1:
            for (int i =0; i<=50; i+=5){
                int y = (4*i) + 1;
                System.out.printf("x = %d ==> y = %d \n",i,y);
            }
            break;
            case 2:
            for (int i = 1; i<=10; i++){
                double y = (double)Math.sqrt(i) - 1;
                System.out.printf("x = %d ==> y = %.2f \n",i,y);
            }
            break;
            case 3:
            for (double i = 1; i<=5; i+=0.5){
                double y = 5*Math.pow(i, 2) + 3*i -2;
                System.out.printf("x = %.2f ==> y = %.2f \n",i,y);
            }
            break;
        }
    }
}