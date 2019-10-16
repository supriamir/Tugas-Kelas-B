import java.util.Scanner;
class Segitiga{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j <= i ; j++){
        arr[i][j] = input.nextInt();
      }
    }
    int atas = 0;
    int kiri = 0;
    int kanan = 0;
    int jumlahKiri = arr[atas][kiri] + arr[atas+1][kiri];
    int jumlahKanan= arr[atas][kanan] + arr[atas+1][kanan+1];
    kanan = 1;
    for(atas = atas + 1 ; atas < n - 1 ; atas++){
      if(jumlahKiri + arr[atas+1][kiri] >= jumlahKiri + arr[atas+1][kiri+1]){
        jumlahKiri += arr[atas+1][kiri];
        kiri = kiri;
      }
      else{
        jumlahKiri += arr[atas+1][kiri+1];
        kiri = kiri + 1;
      }
      if(jumlahKanan + arr[atas+1][kanan] >= jumlahKanan + arr[atas+1][kanan+1]){
        jumlahKanan += arr[atas+1][kanan];
        kanan = kanan;
      }
      else{
        jumlahKanan += arr[atas+1][kanan+1];
        kanan = kanan + 1;
      }
    }
    if(jumlahKanan > jumlahKiri){
      System.out.println(jumlahKanan);
    }
    else{
      System.out.println(jumlahKiri);
    }
  }
}
