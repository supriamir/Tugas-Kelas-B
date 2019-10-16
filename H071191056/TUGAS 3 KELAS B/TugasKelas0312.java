import java.util.Scanner;
public class TugasKelas0312{
  public static void main(String[] args) {
    Scanner raf = new Scanner(System.in);
    int jumlahSepatu = raf.nextInt();
    int ukuran[] = new int[jumlahSepatu];
    String warna[] = new String[jumlahSepatu];
    boolean cek = false;
    for(int i = 0; i < jumlahSepatu; i++){
      ukuran[i] = raf.nextInt();
      warna[i] = raf.next();
    }
    int ukuranSepatuW = raf.nextInt();
    String warnaSepatu = raf.next();
    for(int i = 0; i < jumlahSepatu; i++){
      if(ukuran[i] == ukuranSepatuW && warna[i].equalsIgnoreCase(warnaSepatu)){
        cek = true;
        System.out.println("Sepatu yang Berwarna " + warna[i] + " berukuran " + ukuran[i] + " ditemukan pada indeks ke -" + i);
      }
      cek = false;
    }
  }
}
