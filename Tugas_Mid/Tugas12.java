import java.util.Scanner;
/**
 * Tugas12
 */
public class Tugas12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] shoes = new int[n];
        String[] color = new String[n];
        int i;
        boolean unavailable = true;
        for (i = 0; i < n; i++) {
            System.out.print("Sepatu ke "+(i+1)+" : ");
            shoes[i] = input.nextInt();
            System.out.print("Warna : ");
            color[i] = input.next();
        }
        System.out.print("Ukuran sepatu anda : ");
        int size = input.nextInt();
        System.out.print("Warna yg diinginkan : ");
        String favcolor = input.next();
        for (i = 0; i < n; i++) {
            if (shoes[i]==size && color[i].equalsIgnoreCase(favcolor)) {
                System.out.println("Sepatu anda berada di bagian nomor "+(i+1));
                unavailable = false;
                break;
            }
        }
        if (unavailable == true) {
            System.out.println("Unavailable at this time. come back again.");
        }
        input.close();
    }
}