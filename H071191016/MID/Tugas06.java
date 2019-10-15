import java.util.Scanner;

class Tugas06{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        int [][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                arr [i][j] = yuk.nextInt(); 
            }
        }
        int angka = 0;
        int kiri = 0;
        int kanan = 0;
        int kirisum = arr[angka][kiri] + arr[angka + 1][kiri];
        int kanansum = arr[angka][kanan] + arr[angka + 1][kanan + 1];
        kanan = 1;
        for(angka = angka + 1; angka < n - 1; angka++){
            if(kirisum + arr[angka + 1][kiri] >= kirisum + arr[angka + 1][kiri + 1]){
                kirisum += arr[angka + 1][kiri];
                kiri = kiri;
            }
            else{
                kirisum += arr[angka + 1][kiri + 1];
                kiri = kiri + 1;
            }
            if (kanansum + arr[angka + 1][kanan] >= kanansum + arr[angka + 1][kanan + 1]){
                kanansum += arr[angka + 1][kanan];
                kanan = kanan;
            }
            else{
                kanansum = arr[angka + 1][kanan + 1];
                kanan = kanan + 1;
            }
        } 
        if (kanansum > kirisum){
            System.out.println(kanansum);
        }
        else{
            System.out.println(kirisum);
        }
        yuk.close();
    }
}