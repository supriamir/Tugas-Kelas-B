import java.util.Scanner;
public class TugasLooping02 {
public static void main(String[] args) {
    Scanner ka = new Scanner(System.in);
    System.out.print("N = ");
    int n = ka.nextInt();
    int sum = 0;
    for (int i = 1; i<= n; i++){
        if(n%i == 0){
            sum = sum + i;
        }
    }System.out.println("Sum = " + sum);
}
    
}