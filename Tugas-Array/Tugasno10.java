import java.util.Scanner;

class Tugasno10 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int m = sl.nextInt();
        int n = sl.nextInt();
        int[][] matriks = new int[m][n];
        sl.close();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = sl.nextInt();
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }
    }
}