import java.util.Scanner;

class TugasLooping03{
  public static void main (String args[]){
    Scanner qal = new Scanner(System.in);
    System.out.print("input nilai : ");
    int nilai = qal.nextInt();
    qal.close();
    int ganjil = 0;
    System.out.print("bilangan ganjil : ");

    for(int x=1; x<=nilai; x++){
      if(x%2==1){
         ganjil++;
         System.out.print(x+" ");
       }
    }System.out.println("\nbilangan ganjil : " + ganjil);
  }
}
