import java.util.*;
public class NilaiSwitch{
    public static void main(String[] args){
        Scanner raf = new Scanner(System.in);

        System.out.println("*** Menu ***");
        System.out.println("1. Y = 4x + 1 ");
        System.out.println("2. Y = ^x - 1 ");
        System.out.println("3. Y = 5x^2 + 3x - 2 ");
        int inputMenu = raf.nextInt();

    switch(inputMenu){
        case 1:
        System.out.println(" x\t\t y");
        for(int x = 0; x < 50; x+= 5){
            int ySatu = 4 * x + 1;
            System.out.print(x + "\t\t" + ySatu + "\n");
        }
        
        break;

        case 2:
        System.out.println("\n x\t\t y");
        for(double x2 = 1; x2 < 10; x2++){
            double yDua = Math.sqrt(x2) - 1;
            System.out.printf("%.2f \t\t%.2f \n",x2,yDua);
            
        }
        break;

        case 3:
        System.out.println("\n x\t\t y ");
        for(double x3 = 1; x3 < 5; x3 += 0.5){
            double yTiga = 5 * Math.pow(x3,2) + 3 * x3 - 2;
            System.out.printf("%.2f \t\t%.2f \n",x3,yTiga);
        }
        break;
     } 
    }
}