import java.util.Scanner;

class TugasLooping02{
  public static void main (String args[]){
    Scanner qal = new Scanner(System.in);
    System.out.print("input nilai : ");
    int nilai = qal.nextInt();
    qal.close();
    
    int angka, hasil, sum;
    sum = 0;

    for(angka=1; angka<=nilai; angka++){
      hasil = nilai%angka;
      if(hasil == 0){
        sum += angka;
      }
    }System.out.print("jumlah faktor dari "+nilai+" adalah "+sum);
  }
}
