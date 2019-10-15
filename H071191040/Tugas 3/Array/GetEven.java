import java.util.Scanner;
class GetEven
{
  int n;

  printVariable()
  {
    this(50);
  }
  void printVariable(int n)
  {
    System.out.println("this is printVariable \"variable\" " + n);
    System.out.println("this is instance variable " + this.n);
  }
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    GetEven obj0 = new GetEven();
    obj0.n = read.nextInt();
    int n = 5;
    int num[] = new int[obj0.n];
    for(int i = 0 ; i < obj0.n ; i++)
    {
      num[i] = read.nextInt();
    }
    for(int i = 0 ; i < obj0.n ; i++)
    {
      if(num[i] % 2 == 0)
      {
        System.out.print(num[i] + " ");
      }
    }
    System.out.println("\nthis is local variable " + n);
    System.out.println("this instance variable " + obj0.n);
    obj0.printVariable(30);
    obj0.printVariable();
  }
}
