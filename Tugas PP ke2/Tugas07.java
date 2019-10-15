import java.util.Scanner;

class Tugas07 {

      public static void main(String[] args){
        Scanner cari = new Scanner(System.in);
        
        int n = cari.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        String a = null;
        String b = null;
        String c = null;

        for(int i = 0 ; i < n ; i++){
          String nama = cari.next();
          int nilai = cari.nextInt();

          if(nilai > z){
            z = nilai;
            c = nama;

            if(nilai > y){
                z = y;
                c = b;
                y = nilai;
                b = nama;

              if(nilai > x){
                y = x;
                b = a;
                x = nilai;
                a = nama;
              }
            }
          }
        }
        System.out.println();
        System.out.println(x + y + z);
        System.out.println(a + " " + x);
        System.out.println(b + " " + y);
        System.out.println(c + " " + y);
         
      }
    }
    
