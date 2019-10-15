import java.util.Scanner;
class Tugasno13{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    int t = read.nextInt(); // jumlah kasus
    int sum = 0;
    int avg[] = new int[t]; // rata-rata dalam setiap kasus
    //memasukkan nilai nilai mahasiswa sebanyak kasus
    int count[] = new int[t]; //banyak mahasiswa yang bermasalah tiap kasus
    for(int i = 0; i < t; i++){
      int n = read.nextInt();
      int nilai[] = new int[n]; //nilai mahasiswa sebanyak n mahasiswa

      for(int j = 0; j < n; j++){
        nilai[j] = read.nextInt(); //input nilai mahasiswa
        sum += nilai[j];
      }
      sum /= n;
      avg[i] = sum; //rata2 nilai mahasiswa dalam setiap kasus
      sum = 0;
      count[i] = 0;
      for(int l = 0; l < n; l++){
        count[i] += nilai[l] < avg[i] ? 1:0; //menghitung jumlah mahasiswa yang bermasalah
      }
    }
    for(int i = 0; i < t; i++){
      System.out.println(count[i]);
    }
  }
}