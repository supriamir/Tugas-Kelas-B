import java.util.Scanner;
class Nomor10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int baris = sc.nextInt();
    int kolom = sc.nextInt();
    int arr [][]= new int [baris][kolom];

    for (int i=0; i<arr.length; i++){
        for (int j=0; j<arr.length; j++){
            arr [i][j] = sc.nextInt();
        }
    }

    for(int j=0; j<arr.length; j++){
        System.out.println();
        
        for (int i=(baris-1); i>=0; i--){
            System.out.print(arr[i][j]+" ");
        }
    }

    }
}