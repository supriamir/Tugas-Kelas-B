import  java.util.Scanner;
class Looping02{
  public static void main(String[] args) {
    int sum=0;
    Scanner input = new Scanner (System.in);
    System.out.print("N = ");
    int N = input.nextInt();
    for(int i = 1; i<=N; i++){
      if(N%i==0){
        sum += i;
      }
    }
    System.out.printf("Sum = %d",sum);
  }
}
