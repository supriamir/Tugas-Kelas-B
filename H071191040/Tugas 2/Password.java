import java.util.Scanner;
class Password
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int pass;
    do
    {
      pass = key.nextInt();
      System.out.printf("%s",pass != 2002? "password anda salah\n":"password anda benar");
    }
    while(pass != 2002);
  }
}
