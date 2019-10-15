import java.util.Scanner;

public class TugasPP6 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x[][] = new int[n][n]; // masukan input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                x[i][j] = input.nextInt();
            }
        }
        int maindex = 0;
        int leftdex = 0;
        int rightdex = 0;
        int leftsum = x[maindex][leftdex] + x[maindex + 1][leftdex];
        int rightsum = x[maindex][rightdex] + x[maindex + 1][rightdex + 1];
        rightdex = 1;
        for (maindex = maindex + 1; maindex < n - 1; maindex++) {
            if (leftsum + x[maindex + 1][leftdex] >= leftsum + x[maindex + 1][leftdex + 1]) {
                leftsum += x[maindex + 1][leftdex];
                leftdex = leftdex;
            } else {
                leftsum += x[maindex + 1][leftdex + 1];
                leftdex = leftdex + 1;
            }
            if (rightsum + x[maindex + 1][rightdex] >= rightsum + x[maindex + 1][rightdex + 1]) {
                rightsum += x[maindex + 1][rightdex];
                rightdex = rightdex;
            } else {
                rightsum += x[maindex + 1][rightdex + 1];
                rightdex = rightdex + 1;
            }
        }
        if (rightsum > leftsum) {
            System.out.println(rightsum);
        } else {
            System.out.println(leftsum);
        }
    }
}
