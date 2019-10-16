import java.util.Scanner;
class Teratas{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int pertama = 0;
    int keDua = 0;
    int keTiga = 0;
    String nama1 = null;
    String nama2 = null;
    String nama3 = null;
    for(int i = 0 ; i < n ; i++){
      String nama = input.next();
      int score = input.nextInt();
      if(score > keTiga){
        keTiga = score;
        nama3 = nama;
        if(score > keDua){
          keTiga = keDua;
          nama3 = nama2;
          keDua = score;
          nama2 = nama;
          if(score > pertama){
            keDua = pertama;
            nama2 = nama1;
            pertama = score;
            nama1 = nama;
          }
        }
      }
    }
      System.out.println();
      System.out.println(pertama + keDua + keTiga);
      System.out.println(nama1 + " " + pertama);
      System.out.println(nama2 + " " + keDua);
      System.out.println(nama3 + " " + keTiga);

  }
}
