import java.util.Scanner;
class Tugas12{
  public static void main(String[] args)
  {
    Scanner cari = new Scanner(System.in);
    int n = cari.nextInt(); 
    int h[] = new int[n];
    String warna[] = new String[n];
    boolean dapat = false;
    for(int i = 0; i < n; i++)
    {
      h[i] = cari.nextInt();
      warna[i] = cari.next();  
    }
    int x = cari.nextInt();
    String warnaX = cari.next();
    for(int i = 0; i < n; i++)
    {
      if(h[i] == x && warna[i].equalsIgnoreCase(warnaX))
      {
        dapat = true;
        System.out.println("sepatu berwarna " + warna[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      dapat = false;
    }
  }
}

        