import java.util.Scanner;
public class RotateMatrix {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for ( int j =(m-1); j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
        System.out.println();
        }


    }
}