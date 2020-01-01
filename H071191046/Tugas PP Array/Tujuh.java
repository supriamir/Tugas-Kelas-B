//Mencari pasangan kelompok dengan point tertinggi yang beranggotakan 3 orang.
//Tampilakn total point dari 3 anggota kelompok yang terpilih dan nama-nama dari ketiga orang tersebut.
import java.util.Scanner;
class Tujuh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rank1 = 0, rank2 = 0, rank3 = 0;
    String anggota1 = null;
    String anggota2 = null;
    String anggota3 = null;
    for(int i = 0 ; i < n ; i++) {
        String anggota = sc.next();
        int skor = sc.nextInt();
      if(skor > rank3) {
        rank3 = skor;
        anggota3 = anggota;
        if(skor > rank2) {
          rank3 = rank2;
          anggota3 = anggota2;
          rank2 = skor;
          anggota2 = anggota;
          if(skor > rank1) {
            rank2 = rank1;
            anggota2 = anggota1;
            rank1 = skor;
            anggota1 = anggota;
          }
        }
      }
    }
      System.out.println();
      System.out.println(rank1 + rank2 + rank3);
      System.out.println(anggota1 + " ");
      System.out.println(anggota2 + " ");
      System.out.println(anggota3 + " ");

  }
}