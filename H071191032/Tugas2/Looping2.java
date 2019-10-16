import java.util.Scanner;
class Looping2{
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        boolean condition = true;

        while (condition){
            int password = sc.nextInt();
            if ( password != 2002){
                System.out.println("Password anda salah");
            } else if  ( password == 2002){
                condition = false;
                System.out.println("Password anda benar");
            }
        }
    }
}