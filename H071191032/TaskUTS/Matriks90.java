import java.util.Scanner;
class Matriks90{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int baris = sc.nextInt();
        int kolom = sc.nextInt();
        int[][] matriks = new int [baris][kolom];

        //input matriks
        for ( int i = 0; i < baris; i++){
            for ( int j = 0; j < kolom; j++){
                matriks[i][j] = sc.nextInt();
            }
        }

        //matriks diputar 90 derajat
        for (int i = 0; i < kolom; i++){
            System.out.println();
            for ( int j = (baris - 1) ; j >= 0; j--){
                System.out.print(matriks[j][i] + " ");
            }
        }


    }
}