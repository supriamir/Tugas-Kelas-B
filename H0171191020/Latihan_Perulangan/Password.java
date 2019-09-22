import java.util.Scanner;

class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int password = 2002;
        boolean cek = false;
        while (!cek) {
            System.out.print("Input Password (4 digit angka)\t: ");
            int inputPassword = in.nextInt();
            cek = inputPassword == password;
            if (!cek) {
                System.out.println("Password Anda Salah");
            }
        }
        System.out.println("Password Anda Benar");
        in.close();
    }
}