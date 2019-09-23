import java.util.Scanner;

class Tugas2 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Masukkan password anda :");
        int password = sl.nextInt();

        while (!(password == (2002))) {
            System.out.println("Password anda salah");
            System.out.println();
            System.out.println("Masukkan password anda :");
            password = sl.nextInt();
        }
        System.out.println("Password anda benar!");
    }
}