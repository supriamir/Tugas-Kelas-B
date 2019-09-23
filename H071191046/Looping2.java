import java.util.Scanner;
public class Looping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkkan Password Anda :");
        int password = sc.nextInt();
        while (!(password == (2002))){
            System.out.println("Password Anda Salah");
            System.out.println("Masukkan Password Anda :");
            password = sc.nextInt();
        }
        System.out.println("Password Anda Benar");
    }
}