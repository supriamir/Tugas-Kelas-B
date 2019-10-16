import java.util.Scanner;
class ReverseString{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String words = input.nextLine();
    char chars;
    for(int i = words.length()-1 ; i >= 0; i--){
      chars = words.charAt(i);
      System.out.printf("%c",chars == '(' ? ')': chars == ')' ? '(':chars);
    }
  }
}
