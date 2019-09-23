import java.util.Scanner;
public class Perulangan_3 {

    public static void main(String[] args) {
        Scanner pp = new Scanner (System.in);
        System.out.println("RUMUS 1");

        for (int x1 = 0; x1 <= 50; x1+=5) {
            int y1 = 4*x1+1;
            System.out.printf("x = %d, y = %d\n" , x1,y1);
        }
        System.out.println("RUMUS 2");

        for (double x2 = 1; x2 <= 10 ; x2++) {
            double y2 = Math.sqrt(x2)-1;
            System.out.printf("x = %.2f, y = %.2f\n" , x2,y2);  
        }
        System.out.println("RUMUS 3");
        for (double x3 = 1; x3 <= 5; x3+= 0.5) {
            double y3 = 5*Math.pow(x3, 2)+ 3*x3 - 2;
            System.out.printf("x = %.2f, y = %.2f\n" , x3,y3);
        }
    }
}