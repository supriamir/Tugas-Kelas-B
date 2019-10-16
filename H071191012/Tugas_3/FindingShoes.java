import java.util.Scanner;
class FindingShoes {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); //jumlah sepatu yang ada di toko
    int h[] = new int[n]; //ukuran sepatu yang ada di toko
    String color[] = new String[n]; //warna sepatu yang ada di toko
    boolean find = false;
    for(int i = 0; i < n; i++) {
      h[i] = in.nextInt(); //ukuran sepatu pada indeks ke i
      color[i] = in.next(); //warna sepatu pada indeks ke i
    }
    int x = in.nextInt(); //ukuran sepatu Winda
    String colorx = in.next(); //warna sepatu yang dicari
    for(int i = 0; i < n; i++) {
        if(h[i] == x && color[i].equalsIgnoreCase(colorx)) {
        find = true;
        System.out.println("Sepatu warna " + color[i] + " berukuran " + h[i] + " didapat pada indeks ke " + i); 
        }
      find = false;
    }
  }
}