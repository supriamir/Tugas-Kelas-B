import java.util.Scanner;

class Tugas13 {
  public static void main(String[] args) {
    Scanner ka = new Scanner(System.in);
    int t = ka.nextInt(); // jumlah kasus
    int sum = 0;
    int rata2[] = new int[t];

    int jumlah[] = new int[t]; // jumlah mahasiswa bermasalah
    for (int i = 0; i < t; i++) {

      int n = ka.nextInt();
      int score[] = new int[n];// nilai mahasiswa

      for (int j = 0; j < n; j++) {
        score[j] = ka.nextInt();
        sum += score[j];
      }

      sum /= n;
      rata2[i] = sum; // rata2 nilai mahasiswa dalam setiap kasus
      sum = 0;
      jumlah[i] = 0;
      for (int l = 0; l < n; l++) {
        jumlah[i] += score[l] < rata2[i] ? 1 : 0; // banyak mahasiswa bermasalah
      }
    }
    for (int i = 0; i < t; i++) {
      System.out.println(jumlah[i]);
    }
  }
}