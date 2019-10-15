import java.util.Scanner;

public class TugasPP10 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int baris = input.nextInt();
        int kolom = input.nextInt();
        int[][] matriks = new int[baris][kolom];
        int i, j, k;
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                matriks[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < kolom; i++) {
            System.out.println();
            for (j = (baris - 1); j >= 0; j--) {
                System.out.print(matriks[j][i] + " ");
            }
        }

        System.out.println(" Hasil ");
    }
}
