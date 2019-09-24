import java.util.Scanner;
class Looping01{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("N = ");
    int N = input.nextInt();
    System.out.printf("Faktor dari %d adalah ", N);
    for (int i=1; i<=N;i++ ) {
      if(N%i==0){
        System.out.print(i + " ");
      }
    }
  }
}
