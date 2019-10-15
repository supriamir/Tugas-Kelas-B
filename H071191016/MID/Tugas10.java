import java.util.Scanner;

class Tugas10{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int m = yuk.nextInt();
        int n = yuk.nextInt();
        int [][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = yuk.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = m - 1; j >= 0; j--){
                System.out.print(arr[j][i] +" ");
            }
            System.out.println();
        }
        yuk.close();
    }
}