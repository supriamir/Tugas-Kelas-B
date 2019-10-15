import java.util.Scanner;

class Tugas13{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int a = yuk.nextInt();//Jumlah Kelas
        int[] kelas = new int[a]; 
        for(int i = 0; i < a; i++){
            int n = yuk.nextInt(); //Jumlah Siswa
            int [] arr = new int[n];
            int kasus = 0; //Jumlah Kasus
            int jumlahNilai = 0;
            for(int j = 0; j < n; j++){
                arr [j] = yuk.nextInt(); //Nilai Siswa
                jumlahNilai += arr[j];
            }
            int rata = jumlahNilai/n;
            for(int j = 0; j < n; j++){
                if (arr[j] < rata){
                kasus++;
                }
            }
            kelas[i] = kasus;
        }
        for(int i = 0; i < kelas.length; i++){
            System.out.println("Jumlah Siswa yang Bermasalah = "+ kelas[i]);
        }
    }
}