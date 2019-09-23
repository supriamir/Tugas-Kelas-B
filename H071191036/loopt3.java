import java.util.Scanner;
public class loopt3 {

    public static void main(String[] args) {
        Scanner bay = new Scanner(System.in);
        int x = bay.nextInt(),y;
        int z = 0;
        for(y = 1; y <= x ; y++){
            if(y%2 ==1){
                System.out.print(" "+y);
                z++;

            }
        }System.out.println("\nbilangan ganjil = "+z);

    }
}