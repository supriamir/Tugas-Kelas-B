import java.util.Scanner;
public class loopt1 {
    public static void main(String[] args) {
      Scanner bay = new Scanner(System.in);
      System.out.print("faktor dari = ");
      int x = bay.nextInt(),i,z;
     
      for( i = 1; i <= x; i++){
        z = x % i;
        if(z == 0){
          System.out.print(i +" ");
        }
      }
    }
}