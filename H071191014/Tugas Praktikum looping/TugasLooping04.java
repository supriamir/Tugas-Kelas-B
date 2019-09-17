import java.util.Scanner;

class TugasLooping04{
  public static void main (String args[]){
    Scanner qal = new Scanner(System.in);
    System.out.println("input nilai : ");
    int a = qal.nextInt();
    int b = qal.nextInt();
    int c = qal.nextInt();
    int d = qal.nextInt();
    int e = qal.nextInt();
    qal.close();
 
    int genap=0;
    int ganjil=0;
    int positif=0;
    int negatif=0;

    genap = (a%2==0?1:0)+(b%2==0?1:0)+(c%2==0?1:0)+(d%2==0?1:0)+(e%2==0?1:0);
    ganjil = (a%2==1?1:0)+(b%2==1?1:0)+(c%2==1?1:0)+(d%2==1?1:0)+(e%2==1?1:0);
    positif = (a>0?1:0)+(b>0?1:0)+(c>0?1:0)+(d>0?1:0)+(e>0?1:0);
    ganjil = (a<0?1:0)+(b<0?1:0)+(c<0?1:0)+(d<0?1:0)+(e<0?1:0);

    System.out.println(genap + " bilangan genap");
    System.out.println(ganjil + " bilangan ganjil");
    System.out.println(positif + " bilangan positif");
    System.out.println(negatif + " bilangan negatif");
  }
}
