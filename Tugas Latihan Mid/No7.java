import java.util.Scanner;
class No7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] score = new int[n];
    String [] name = new String[n];
    int first= 0;
    int second= 0;
    int third= 0;
    String person1= null;
    String person2= null;
    String person3= null;

    if(n>=3)
    {
      for(int i=0; i<n; i++)
      {
        name[i]=sc.next();
        score[i]=sc.nextInt();
        if(score[i]>third){
          third = score[i];
          person3 = name[i];
          if(score[i]>second){
            third=second;
            person3=person2;
            second=score[i];
            person2=name[i];
            if(score[i]>first){
              second=first;
              person2=person1;
              first=score[i];
              person1=name[i];
            }
          }
        }

      }
      System.out.printf("%d\n%s\n%s\n%s",first+second+third,person1,person2,person3);
    }
  }
}
