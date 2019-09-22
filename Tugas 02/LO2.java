import java.util.Scanner;
class LO2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("password :");
        int a = in.nextInt();
        while (a != 2002){
            System.out.println("pass salah :" +a);
            a =in.nextInt();
        }
        System.out.println("**Ini pass yang  benar**");
    }
}