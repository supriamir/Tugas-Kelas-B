import java.util.Scanner;
/**
 * Tugas10
 */
public class Tugas10 {

    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        int baris = ka.nextInt();
        int kolom = ka.nextInt();
        int arr [][] = new int [baris][kolom];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = ka.nextInt();
            }
        }

        for(int j = 0; j < arr.length; j++){
            System.out.println();

            for(int i = (baris-1); i >=0; i--){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}