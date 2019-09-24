import java.util.Scanner;
class Pangkat{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int base = sc.nextInt();
    int pangkat = sc.nextInt();
    sc.close();
    double sum = 1;
    System.out.printf("%d ^ %d = ",base,pangkat);
    if(pangkat>0){
      for (int i=1;i<=pangkat;i++) {
        sum*=base;
      }System.out.print(sum);
    } else if(pangkat<0){
      for (int i=-1;i>=pangkat;i--){
        sum*=(double)(1f/base);
      }System.out.printf("%.3f",sum);
    }else{
      System.out.print("1");
    }

  }
}
