import java.util.Scanner;

public class PasswordLoop{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);

        System.out.println("Masukkan Password: ");
        int password = raf.nextInt();

        int i = 0;
        while (i != password){
            i += password;
            if(password != 2002){
            System.out.println("\'Password anda salah\'");
            System.out.println("Masukkan Lagi Password Anda: ");
            password = raf.nextInt();
            }
            else{
                System.out.println("\n\'Password Anda Benar\'");
                System.exit(0);
            }
        }
    }
}