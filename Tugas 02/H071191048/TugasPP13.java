import java.util.Scanner;

public class TugasPP13 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        System.out.println("jumlah kasus");
        int t = input.nextInt();
        int sum = 0;
        System.out.println("masukkan nilai rata rata dalam setiap kasus");
        int average[] = new int[t];

        int count[] = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.println("masukan nilai mahasiswa sebanyak n mahasiswa tersebut");
            int n = input.nextInt();
            int nilai[] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("masukkan input nilai mahasiswa");
                nilai[j] = input.nextInt();
                sum += nilai[j];
            }
            sum /= n;
            average[i] = sum;
            sum = 0;
            count[i] = 0;
            for (int l = 0; l < n; l++) {
                count[i] += nilai[l] < average[i] ? 1 : 0;
            }
        }
        for (int i = 0; i < t; i++) {

            System.out.println("hasil nilai " + count[i]);
        }
    }
}