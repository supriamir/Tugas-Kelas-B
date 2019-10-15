import java.util.Scanner;
class PrimeEach
{
  public static void main(String args[])
  {
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int value[] = new int[n];
    for(int i = 0 ; i < value.length ; i++)
    {
      value[i] = read.nextInt();
    }
    // mencari relatif prima
    for(int i = 0,x; i < array.length ; i++) 
    {
      x = 1;
      x += i;
      for(int j = 0 ; j < n-1 ; j++)
      {
        if(value[i] % value[x] != 0 && value[x] % value[i] != 0)
        {
          System.out.println(value[i] + " " + value[x]);
        }
        x++;
      }
      n--;
    }
  }
}
