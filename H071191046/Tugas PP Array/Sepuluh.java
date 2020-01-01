//MAtriks N X M. Cetak kembali matriks tersebut setelah diputar 90 derajat searah jarum jam.
import java.util.Scanner;
class Sepuluh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = sc.nextInt();
        int kolom = sc.nextInt();
        int [][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < kolom; i++) {
            System.out.println();
            for (int j = (baris-1); j >= 0; j--) {
                System.out.print(matriks[j][i] + " ");
            }
        }
    }
}