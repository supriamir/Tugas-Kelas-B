import java.util.Scanner;

public class Tugas13 {

    public static void main(String[] args) {
        Scanner sep = new Scanner (System.in);
        int t = sep.nextInt();
        int sum = 0;
        int rataRata [] = new int [t];
        int mahasiswa [] = new int [t];

        for (int i = 0; i < t; i++) {
            int n = sep.nextInt();
            int nilai [] = new int [n];
            
            for (int j = 0; j < n; j++) {
                nilai [j] = sep.nextInt();
                sum += nilai [j];
            }
            sum /=n;
            rataRata [i] = sum ;
            sum = 0 ;
            mahasiswa [i] = 0 ;
            
            for (int l = 0; l < n; l++) {
                mahasiswa[i] += nilai [l] < rataRata[i] ? 1:0;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(mahasiswa[i]);
        }
    }
}