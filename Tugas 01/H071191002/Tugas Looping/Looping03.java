import java.util.Scanner;
class Looping03{
  public static void main(String[] args) {
    int ganjil = 0;
    Scanner input = new Scanner (System.in);
    System.out.print("N = ");
    int N = input.nextInt();
    System.out.print("Bilangan ganjil = ");
      for(int i=0; i<=N; i++){
        if(i%2!=0){
          System.out.printf("%d ",i);
          ganjil++;
        }

      } System.out.printf("\nBanyak bilangan ganjil = %d",ganjil);
      }
  }
