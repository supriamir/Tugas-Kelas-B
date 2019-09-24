import java.util.Scanner;
class dua{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("masukkan password");
        int pass = pew.nextInt();

        while(pass !=2002){
            System.out.println("password anda salah \ncoba lagi");
            pass = pew.nextInt();
        }System.out.println("password anda benar");
            
            
            
    }


}