import java.util.Scanner;
public class Perulangan_2 {

    public static void main(String[] args) {
        Scanner pp = new Scanner (System.in);
        System.out.println("masukkan kata sandi");
        int password = pp.nextInt();

        while (password != 2002){
            System.out.println("Password Anda Salah");
            password = pp.nextInt();
        }
        System.out.println("Password Anda Benar");
        pp.close();
        }
    }
