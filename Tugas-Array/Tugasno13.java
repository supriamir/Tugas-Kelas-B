import java.util.Scanner;

class Tugasno13 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int t = sl.nextInt();
        int sum = 0;
        int[] ratarata = new int[t];
        int[] mahasiswa = new int[t];

        for (int i = 0; i < t; i++) {
            int n = sl.nextInt();
            int[] nilai = new int[n];

            for (int j = 0; j < n; j++) {
                nilai[j] = sl.nextInt();
                sum += nilai[j];
            }
            sum /= n;
            ratarata[i] = sum;
            sum = 0;
            mahasiswa[i] = 0;

            for (int k = 0; k < n; k++) {
                mahasiswa[i] += nilai[k] < ratarata[i] ? 1 : 0;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(mahasiswa[i]);
        }
    }
}