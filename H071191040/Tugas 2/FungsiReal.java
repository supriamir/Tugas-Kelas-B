import java.util.Scanner;
class FungsiReal
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    float x = key.nextFloat();
    if(x >= 0 && x <=50)
    {
      for(float i = x ; i <= 50 ; i+=5)
      {
        float y = 4*i + 1;
        System.out.printf("4(%.0f) + 1 = %.2f\n",i,y);
      }
    }
    if(x >= 1 && x <= 10)
    {
      for(double i = x ; i <= 10 ; i++)
      {
        double y = Math.sqrt(i) - 1;
        System.out.printf("sqrt(%.0f) - 1 = %.2f\n",i,y);
      }
    }
    if(x >= 1 && x <= 5)
    {
      for(float i = x ; i <= 5 ; i+=0.1)
      {
        float y = 5*i*i +3*i - 2;
        System.out.printf("5(%.1f)^2 + 3(%.1f) - 2 = %.2f\n",i,i,y);
      }
    }
  }
}
