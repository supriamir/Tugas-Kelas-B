import java.util.Scanner;

class Tugasno12 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int n = sl.nextInt(); // jumlah sepatu yang tersedia di toko
        int[] h = new int[n]; // ukuran sepatu yang tersedia di toko
        String[] warna = new String[n]; // warna sepatu yang tersedia di toko
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            h[i] = sl.nextInt(); // ukuran sepatu pada indeks ke i
            warna[i] = sl.next(); // warna sepatu pada indeks ke i
        }

        int x = sl.nextInt(); // ukuran sepatu Winda
        String warnaX = sl.next(); // warna sepatu yang dicari

        for (int i = 0; i < n; i++) {
            if (h[i] == x && warna[i].equalsIgnoreCase(warnaX))
                ditemukan = true;
            System.out.println("Sepatu berwarna" + warna[i] + "berukuran" + h[i] + "ditemukan pada indeks ke" + i);
        }
        ditemukan = false;
    }
}