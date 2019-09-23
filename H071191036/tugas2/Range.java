import java.util.Scanner;
public class Range {

    public static void main(String[] args) {
        Scanner bay=new Scanner(System.in);
        int x;
        double y;
        double z;
        
        System.out.println("pers 1");
        for (int i = 0; i <=50 ; i = i+5){
            x = 4*i+1;
            System.out.printf("x= %d,y= %d \n",i,x);
        }System.out.println("pers 2");
        for (double i = 1; i <= 10; i++){
            y = Math.sqrt(i)-1;
            System.out.printf("x = %.2f,y = %.2f \n ",i,y);
        }System.out.println("pers 3");
        for(double i = 1; i<= 5;i = i+0.5){
            z = (5*i*i)+(3*i)-2;
            System.out.printf("x = %.2f,y = %.2f \n",i,z);

        }
        
    }
}
