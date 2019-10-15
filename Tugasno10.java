import java.util.Scanner;
class Tugasno10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int matriks[][] = new int[m][n];
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        matriks[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i < n; i++){
      for(int j = m-1; j >= 0; j--){
        System.out.print(matriks[j][i] + " ");
      }
      System.out.println();
    }
  }
}