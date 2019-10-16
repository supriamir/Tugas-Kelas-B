import java.util.Scanner;
public class TugasKelas0307{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        System.out.println("Insert Number of Group: ");
        int group = raf.nextInt();
        //String n = raf.nextLine();
        //int m = raf.nextInt();
        //String[] memberName = new String[m];
        //int[] score = new int[m];
        int peringkat1 = 0;
        int peringkat2 = 0;
        int peringkat3 = 0;

        String member1 = " ";
        String member2 = " ";
        String member3 = " ";

        for(int i = 0; i < group; i++){
          String memberName = raf.next();
          int score = raf.nextInt();
              if(score > peringkat1){
                peringkat1 = score;
                member1 = memberName;
                if(score > peringkat2){
                  peringkat1 = peringkat2;
                  peringkat2 = score;
                  member1 = member2;
                  member2 = memberName;
                  if(score > peringkat3){
                    peringkat2 = peringkat3;
                    peringkat3 = score;
                    member2 = member3;
                    member3 = memberName;
                  }
                }
              }
        }
        int totalNilaiTertinggi = peringkat1 + peringkat2 + peringkat3;
        System.out.println(totalNilaiTertinggi);
        System.out.println(member3);
        System.out.println(member2);
        System.out.println(member1);
    }
}
