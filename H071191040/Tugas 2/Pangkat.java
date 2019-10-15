import java.util.Scanner;
class Pangkat
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int base = key.nextInt();
    int pangkat = key.nextInt();
    double result = 1;
    if(pangkat >= 0)
    {
      for(int i = 0 ; i < pangkat ; i++)
      {
        result *= base;
      }
    }
    else if(pangkat < 0)
    {
      for(int i = 0 ; i > pangkat ; i--)
      {
        result = 1/(base*result);
      }
    }

    System.out.printf("%d^%d = %.2f",base,pangkat,result);
  }
}
