import java.util.Scanner;
public class TugasKelas0313{
  public static void main(String[] args) {
    Scanner raf = new Scanner(System.in);
    System.out.println("Jumlah Kasus: ");
    int kasus = raf.nextInt();
    int banyakMurid;

    int rata2Nilai[] = new int[kasus];

    int jumlahNilai = 0;
    //int jumlahMurid = 0;
    int muridBermasalah[] = new int[kasus];
    for(int i = 0; i < kasus; i++){
      banyakMurid = raf.nextInt();
      int nilaiMurid[] = new int[banyakMurid];
      for(int j = 0; j < banyakMurid; j++){
        nilaiMurid[j] = raf.nextInt();
        jumlahNilai += nilaiMurid[j];
      }
      jumlahNilai /= banyakMurid;
      rata2Nilai[i] = jumlahNilai;
      //System.out.println(rata2Nilai[i]);
      muridBermasalah[i] = 0;
      for(int k = 0; k < banyakMurid; k++){
        if(nilaiMurid[k] < rata2Nilai[i]){
          muridBermasalah[i] += 1;
        }
        else{
          muridBermasalah[i] += 0;
        }
      }
    }
    for(int i = 0; i < kasus; i++){
      System.out.println(muridBermasalah[i]);
    }

    /*jumlahNilai /= jumlahMurid;
    System.out.println(jumlahNilai);
    */

    /*int banyakMurid, nilaiMurid;

    double rata2Nilai = 0;
    int jumlahMurid = 0;

    for(int i = 0; i < kasus; i++){
      banyakMurid = raf.nextInt();
      for(int j = 0; j < banyakMurid; j++){
      nilaiMurid = raf.nextInt();
      rata2Nilai += nilaiMurid;
      if(nilaiMurid)
      }
      jumlahMurid += banyakMurid;
    }
    rata2Nilai /= jumlahMurid;
    System.out.println(rata2Nilai);
    */


  }
}
