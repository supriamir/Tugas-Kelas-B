import java.util.Scanner;
public class TugasKelas0310{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        System.out.println("Please Insert Matriks: ");
        int baris = raf.nextInt();
        int kolom = raf.nextInt();

        int[][] barisKolom = new int[baris][kolom];
        for(int i = 0; i < baris; i ++){
          for(int j = 0; j < kolom; j++){
              barisKolom[i][j] = raf.nextInt();
          }
        }
        System.out.println("\nBentuk 90 Derajat dari matrix " + baris
                            + " x " + kolom + " adalah \n");
        for(int i = 0; i < baris; i++){
          for(int j = kolom -1; j >= kolom - kolom; j--){
            System.out.print(barisKolom[j][i] + " ");
          }
          System.out.println();
        }
    }
}
