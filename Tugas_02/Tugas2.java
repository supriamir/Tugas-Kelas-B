import java.util.Scanner;
class Tugas2 {
public static void main(String[] args) {
    Scanner ka = new Scanner (System.in);
    System.out.println("Masukkan Password = ");
    int pass = ka.nextInt();

    while (pass != 2002){
        System.out.println("Password Anda Salah");
        pass = ka.nextInt();
    }
    System.out.println("Password Anda Benar");
    
ka.close();
}
    
}