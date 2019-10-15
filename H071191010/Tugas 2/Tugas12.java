import java.util.Scanner;
class Tugas12{

  public static void main(String[] args){

    Scanner read = new Scanner(System.in);
    int n = read.nextInt(); //jumlah sepatu yang ada di toko
    int h[] = new int[n]; //ukuran sepatu yang ada di toko
    String warna[] = new String[n]; //warna sepatu yang ada di toko
    boolean dapat = false;

    for(int i = 0; i < n; i++){
      h[i] = read.nextInt(); //ukuran sepatu pada indeks ke i
      warna[i] = read.next(); //warna sepatu pada indeks ke i
    }
    int x = read.nextInt(); //ukuran sepatu Winda
    String warnaX = read.next(); //warna sepatu yang dicari

    for(int i = 0; i < n; i++){
      if(h[i] == x && warna[i].equalsIgnoreCase(warnaX)){
        dapat = true;
        System.out.println("sepatu berwarna " + warna[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      dapat = false;
    }
  }
}