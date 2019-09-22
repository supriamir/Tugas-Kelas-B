import java.util.Scanner;
public class Pangkat {

    public static void main(String[] args) {
        Scanner bay = new Scanner(System.in);
        System.out.print("base = ");
        int b =bay.nextInt();
        System.out.print("pangkat = ");
        int p =bay.nextInt();
        int hasil = 1;
        for (int i = 1; i <= p; i++){
      
            hasil =hasil*b; 
        }   System.out.println(b+"^"+p +"= "+ hasil);

    }
}
 