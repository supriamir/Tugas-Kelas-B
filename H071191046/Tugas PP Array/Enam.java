// menghitung nilai terbesar dari angka-angka yang ada dalam jalur yang dimulai
//dari atas sampai ke bawah bawah.
import java.util.Scanner;
class Enam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int input[][] = new int[N][N];
    for(int i = 0 ; i < N ; i++) {
      for(int j = 0 ; j <= i ; j++) {
        input[i][j] = sc.nextInt();
      }
    }
    int a = 0;
    int kiri = 0;
    int kanan = 1;
    int sumkiri = input[a][kiri] + input[a+1][kiri];
    int sumkanan = input[a][kanan] + input[a+1][kanan+1];
    for(a = a + 1 ; a < N - 1 ; a++){
      if(sumkiri + input[a+1][kiri] >= sumkiri + input[a+1][kiri+1]) {
        sumkiri += input[a+1][kiri];
        kiri = kiri;
      }
      else {
        sumkiri += input[a+1][kiri+1];
        kiri = kiri + 1;
      }
      if(sumkanan + input[a+1][kanan] >= sumkanan + input[a+1][kanan+1]) {
        sumkanan += input[a+1][kanan];
        kanan = kanan;
      }
      else {
        sumkanan += input[a+1][kanan+1];
        kanan = kanan + 1;
      }
    }
    if(sumkanan > sumkiri){
      System.out.println(sumkanan);
    }
    else {
      System.out.println(sumkiri);
    }
  }
}