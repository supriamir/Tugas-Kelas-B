import java.util.Scanner;
class tugasb02{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("password :");
        int a = in.nextInt();
        while (a != 2002){
            System.out.println("password anda salah :" +a);
            a =in.nextInt();
        }
        System.out.println("password benar");
    }
}