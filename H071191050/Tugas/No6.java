import java.util.Scanner;
class No6 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String huruf = sc.nextLine();
    char chr;
    for(int i = huruf.length()-1 ; i >= 0; i--)
    {
      chr = huruf.charAt(i);
      System.out.printf("%c",chr == '(' ? ')': chr == ')' ? '(':chr);
    }
  }
}
