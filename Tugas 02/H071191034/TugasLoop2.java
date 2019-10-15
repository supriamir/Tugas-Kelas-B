import java.util.Scanner;
class TugasLoop2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan password ");
        
        int password = sc.nextInt();

            while (password !=2002){

                System.out.print("Password Anda Salah \nCoba Lagi ");
                password = sc.nextInt();
            }
        System.out.println("Password Anda Benar ");
        sc.close();
    }
}