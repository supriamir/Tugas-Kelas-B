import java.util.Scanner;
class Tigabelas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); 
    int sum = 0;
    int ratarata[] = new int[T]; 
    int count[] = new int[T]; 
    for(int i = 0; i < T; i++) {
      int n = sc.nextInt();
      int nilai[] = new int[n]; 
      for(int j = 0; j < n; j++) {
        nilai[j] = sc.nextInt(); 
        sum = sum + nilai[j];
      }
      sum = sum/n;
      ratarata[i] = sum; 
      sum = 0;
      count[i] = 0;
      for(int k = 0; k < n; k++) {
        count[i] += nilai[k] < ratarata[i] ? 1:0; 
      }
    }
    for(int i = 0; i < T; i++) {
      System.out.println(count[i]);
    }
  }
}