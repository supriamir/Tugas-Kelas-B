import java.util.Scanner;
class Tugas6
{
  public static void main(String[] args){
    Scanner ka = new Scanner(System.in);
    int n = ka.nextInt();
    int arr[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j <= i ; j++){
        arr[i][j] = ka.nextInt();
      }
    }
    int m = 0; //indeks utama
    int r = 0; //indeks kanan
    int l = 0; //indeks kiri 
    int sumkanan = arr[m][r] + arr[m+1][r+1];
    int sumkiri = arr[m][l] + arr[m+1][l];
    r = 1;
    for(m = m + 1 ; m < n - 1 ; m++){
      if(sumkiri + arr[m+1][l] >= sumkiri + arr[m+1][l+1]){
        sumkiri += arr[m+1][l];
        l = l;
      }else{
        sumkiri += arr[m+1][l+1];
        l = l + 1;
      }
      if(sumkanan + arr[m+1][r] >= sumkanan + arr[m+1][r+1]){
        sumkanan += arr[m+1][r];
        r = r;
      }else{
        sumkanan += arr[m+1][r+1];
        r = r + 1;
      }
    }
    if(sumkanan > sumkiri){
      System.out.println(sumkanan);
    }else{
      System.out.println(sumkiri);
    }
  }
}