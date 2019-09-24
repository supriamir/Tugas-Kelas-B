import java.util.Scanner;
class tiga{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);        
        int x;
        double y,z;
        System.out.println("range x (0-50) dengan increment 5 = ");
        for(int i=0;i<50;i+=5){
            x = (4*i)+1;
            System.out.printf("x=%d, y=%d \n" , i, x);
        }
        System.out.println("range x (1-10) dengan increment 1 = ");
        for(double i=1;i<10;i+=1){
            y = Math.sqrt(i)-1;
            System.out.printf("x=%.2f, =%.2f \n" , i, y);
        }
        System.out.println("range x (1-5) dengan increment 0.5 = ");
        for (double i=1;i<5;i+=0.5){
            z = 5 * (Math.pow(i, 2) ) + (3*i) - 2;
            System.out.printf("x=%.2f, y=%.2f \n" , i, z);
        }
    }
}