import java.util.Scanner;

public class TugasPP10 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // jumlah sepatu yang ada di toko
        int h[] = new int[n]; // ukuran sepatu yang ada di toko
        String warna[] = new String[n]; // warna sepatu yang ada di toko
        boolean found = false;
        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt(); // ukuran sepatu pada indeks ke i
            warna[i] = input.next(); // warna sepatu pada indeks ke i
        }
        int x = input.nextInt(); // ukuran sepatu Winda
        String warnax = input.next(); // warna sepatu yang dicari
        for (int i = 0; i < n; i++) {
            if (h[i] == x && warna[i].equalsIgnoreCase(warnax)) {
                found = true;
                System.out.println("sepatu berwarna " + warna[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
            } else
                found = false;
        }
    }
}