import java.util.Scanner;
public class Perulangan {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("password = ");
        int a = sc.nextInt();
        while (a != 2002) {
            System.out.println("password yang anda masukkan salah = "+ a);
            a=sc.nextInt();
        }
            System.out.println("ini password yang benar");
    }
}