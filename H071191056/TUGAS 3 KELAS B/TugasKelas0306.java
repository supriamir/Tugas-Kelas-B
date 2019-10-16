import java.util.Scanner;
public class TugasKelas0306{
    public static void main(String[] args) {
      Scanner raf = new Scanner(System.in);
        System.out.println("Input Jumlah Baris Segitiga: ");
        int baris = raf.nextInt();
        //int kolom = raf.nextInt();
        int[][] barisSegitiga = new int[baris][baris];
        for(int i = 0; i < baris; i++){
          for(int j = 0 ; j <  i + 1; j++){
              barisSegitiga[i][j] = raf.nextInt();
          }
        }
        int barisTengah = 0;
        int barisKiri = 0;
        int barisKanan = 0;
        int jumlahKiri = barisSegitiga[barisTengah][barisKiri] + barisSegitiga[barisTengah + 1][barisKiri];
        int jumlahKanan = barisSegitiga[barisTengah][barisKanan] + barisSegitiga[barisTengah + 1][barisKanan + 1];
        barisKanan = 1;
        for(barisTengah = barisTengah + 1; barisTengah < baris - 1; barisTengah++){
          if(jumlahKiri + barisSegitiga[barisTengah + 1][barisKiri] >= jumlahKiri + barisSegitiga[barisTengah + 1][barisKiri + 1]){
            jumlahKiri += barisSegitiga[barisTengah + 1][barisKiri];
            barisKiri = barisKiri;
          }
          else{
            jumlahKiri += barisSegitiga[barisTengah + 1][barisKiri + 1];
            barisKiri = barisKiri + 1;
          }
          if(jumlahKanan + barisSegitiga[barisTengah + 1][barisKanan] >= jumlahKanan + barisSegitiga[barisTengah + 1][barisKanan + 1]){
            jumlahKanan += barisSegitiga[barisTengah + 1][barisKanan];
            barisKanan = barisKanan;
          }
          else{
            jumlahKanan += barisSegitiga[barisTengah + 1][barisKanan + 1];
            barisKanan = barisKanan + 1;
          }


        }
        if(jumlahKanan > jumlahKiri){
          System.out.println(jumlahKanan);
        }
        else{
          System.out.println(jumlahKiri);
        }
    }
}
