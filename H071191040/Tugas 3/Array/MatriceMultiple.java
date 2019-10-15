import java.util.Scanner;
class MatriceMultiple
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int m = read.nextInt();
    int l = read.nextInt();
    int matrice1 [][] = new int[n][m];
    int matrice2 [][] = new int[m][l];
    int matrice [][] = new int[n][l];
    for(int i = 0 ; i < n ; i++)
    {
      for(int j = 0 ; j < m ; j++)
      {
        matrice1[i][j] = read.nextInt();
      }
    }
    for(int i = 0 ; i < m ; i++)
    {
      for(int j = 0 ; j < l ; j++)
      {
        matrice2[i][j] = read.nextInt();
      }
    }
    // Multiplication
    for(int i = 0, k = 0, x = 0 ; i < n ; i++)
    {
      for(int j = 0 ; j < l ; j++)
      {
        matrice[i][j] = matrice1[i][k] * matrie2[x][j] + matrice1[i][k+1] * matrice2[x+1][j];
      }
    }
    for(int i = 0 ; i < n ; i++)
    {
      for(int j = 0 ; j < l ; j++)
      {
        System.out.print(matrice[i][j] + " ");
      }
      System.out.println();
    }
  }
}
