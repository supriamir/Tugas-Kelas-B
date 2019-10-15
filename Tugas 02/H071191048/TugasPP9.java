import java.util.Scanner;

public class TugasPP9 {

    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        String tulis = input.nextLine();
        char chars;
        for (int i = tulis.length() - 1; i >= 0; i--) {
            chars = tulis.charAt(i);
            System.out.printf("%c", chars == '(' ? ')' : chars == ')' ? '(' : chars);
        }
    }
}