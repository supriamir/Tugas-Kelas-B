import java.util.Scanner;
/**
 * Tugas06
 */
public class Tugas06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int side =(int) Math.pow(2, (n-1));
        int [][] triangle = new int[n][];
        int max = 0;

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i+1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < side; i++) {
            int up = 0;
            int probability = triangle[0][0];
            for (int j = 0; j < n-1; j++) {
                int down = 1;
                for (int k = 0; k < j; k++) {
                    down *= 2;
                }
                if ((i&down)==0) {
                    up+=0;
                } else if ((i&down)!=0) {
                    up++;
                }
                probability += triangle[j+1][up];
            }
            if (probability > max) {
                max = probability;
            }
        }
        System.out.println(max);
        input.close();
    }
}