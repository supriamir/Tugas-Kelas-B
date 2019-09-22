import java.util.Scanner;
class LO3{
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int a =in.nextInt();
     double b,c =in.nextDouble();
     System.out.println("range x (0-50) dengan incremen 5 : ");
     for (int x=0; x <=50; x+=5){
          a = (4*x) +1;
          System.out.println(a);
     }
     System.out.println("range x (1-10) dengan incremen 1: ");
     for(double y =1; y<=10; y+=1){
          b =Math.sqrt(y)-1;
          System.out.printf("%.2f \n", b);
     }
     System.out.println("range x (1-5) dengan incremen 1/2 : ");
     for(double z =1; z<=5; z+=0.5){
          c = 5*(Math.pow(z, 2) +(3*z)-2);
          System.out.printf("%.2f \n", c);
     }
    
  }
}