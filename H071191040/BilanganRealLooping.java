import java.util.Scanner;
class BilanganRealLooping
{
  public static void main(String[] args)
  {
    int odd=0;
    int even=0;
    int pos=0;
    int neg=0;
    Scanner key = new Scanner(System.in);
    for(int i = 0 ; i < 5 ; i++)
    {
      int n = key.nextInt();
      if(n % 2 == 0 && n > 0) /* mengecek apakah bilangan genap dan positif */
      {
        even++;
        pos++;
      }
      else if(n % 2 == 0 && n < 0) /* mengecek apakah bilangan genap dan negatif */
      {
        neg++;
        even++;
      }
      else if(n % 2 != 0 && n > 0) /* mengecek apakah bilangan ganjil dan positif */
      {
        odd++;
        pos++;
      }
      else if(n % 2 != 0 && n < 0) /* mengecek apakah bilangan ganjil dan negatif */
      {
        odd++;
        neg++;
      }
      else /* mengecek apakah nol */
      {
        even++;
      }
    }
    System.out.printf("%d bilangan genap%n",even);
    System.out.printf("%d bilangan ganjil%n",odd);
    System.out.printf("%d bilangan positif%n",pos);
    System.out.printf("%d bilangan negatif%n",neg);
  }
}
