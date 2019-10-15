import java.util.Scanner;
/**
 * Tugas10
 */
public class Tugas10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matrix = new int[m][n];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println();
            for (j = (m-1); j >=0; j--) {
                System.out.print(matrix[j][i]+" ");
            }
        }
        input.close();
    }
}