import java.util.Scanner;
class BilanganRealLooping
{
  public static void main(String[] args)
  {
    int odd=0,even=0,pos=0,neg=0;
    Scanner key = new Scanner(System.in);
    for(int i = 0 ; i < 5 ; i++)
    {
      int n = key.nextInt();
      if(i % 2 == 0 && i > 0)
      {
        even++;
        pos++;
      }
      else if(i % 2 == 0 && i < 0)
      {
        neg++;
        even++;
      }
      else if(i % 2 != 0 && i > 0)
      {
        odd++;
        pos++;
      }
      else
      {
        odd++;
        neg++;
      }
    }
    System.out.printf("%d bilangan genap%n",even);
    System.out.printf("%d bilangan ganjil%n",odd);
    System.out.printf("%d bilangan positif%n",pos);
    System.out.printf("%d bilangan negatif%n",neg);
  }
}
