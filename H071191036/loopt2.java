import java.util.Scanner;
public class loopt2 {

    public static void main(String[] args) {
        Scanner bay = new Scanner(System.in);
        int x = bay.nextInt(),i,z;
        int w = 0;
        for (i = 1; i <= x; i++){
            z = x%i;
            if (z == 0){
                w += i;
            }
        }System.out.println("jumlah faktor dari "+x+" adalah "+w);
    }
}