import java.util.Scanner;
class ProblemStudent {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt(); // jumlah kasus
    int sum = 0;
    int avg[] = new int[cases]; // rata-rata dalam setiap kasus
    //memasukkan nilai nilai mahasiswa sebanyak kasus
    int count[] = new int[cases]; //banyak mahasiswa yang bermasalah tiap kasus
    for(int i = 0; i < cases; i++) {
      int n = in.nextInt();
      int nilai[] = new int[n]; //nilai mahasiswa sebanyak n mahasiswa

      for(int j = 0; j < n; j++) {
        nilai[j] = in.nextInt(); //input nilai mahasiswa
        sum += nilai[j];
      }
      sum /= n;
      avg[i] = sum; //rata2 nilai mahasiswa dalam setiap kasus
      sum = 0;
      count[i] = 0;
      for(int l = 0; l < n; l++) {
        count[i] += nilai[l] < avg[i] ? 1:0; //menghitung jumlah mahasiswa yang bermasalah
      }
    }
    for(int i = 0; i < cases; i++) {
      System.out.println(count[i]);
    }
  }
}