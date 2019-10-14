import java.util.Scanner;
  class faktBil {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      System.out.printf("%d merupakan kelipatan dari ",a);
      if(a > 0)
      {
        for(int i = 1; i <= a; i++)
        {
          if(a % i == 0)
          {
            System.out.printf("%d ",i);
          }
        }
      }
      else if(a < 0)
      {
        for(int i = 1; i <= (-1*a) ; i++)
        {
          if(a % i == 0)
          {
            System.out.printf("%d ",i);
          }
        }
      }
      else
      {
        System.out.printf("null");
      }


  }
}