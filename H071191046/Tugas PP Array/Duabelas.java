//Mencari sepatu keberapa yang cocok dengan ukuran kaki Winda
import java.util.Scanner;
class Duabelas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //h = ukuran sepatu
    int n = sc.nextInt(); 
    int h[] = new int[]; 
    String warna[] = new string[]; 
    boolean found = false;
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt(); 
      warna[i] = sc.nextInt(); 
    }
    int sepatuWinda = sc.nextInt(); 
    String warnaCari = sc.next(); 
    for(int i = 0; i < n; i++) {
      if(h[i] == x && colour[i].equalsIgnoreCase(warnaCari)) {
        found = true;
        System.out.println("sepatu berwarna " + warna[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      found = false;
    }
  }
}