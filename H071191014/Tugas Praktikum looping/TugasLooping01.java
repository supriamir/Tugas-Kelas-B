import java.util.Scanner;
class TugasLooping01{
  public static void main (String args[]){
    Scanner qal = new Scanner(System.in);
    System.out.print("input nilai : ");
    int x = qal.nextInt(),y,z;
    qal.close();

    for(y=1; y<=x; y++){
      z = x%y;
      if(z == 0){
        System.out.print(y+ " ");
      }
    }
  }
}
