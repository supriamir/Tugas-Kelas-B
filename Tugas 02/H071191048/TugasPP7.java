import java.util.Scanner;

public class TugasPP7 {
    public static void main(String[] args) {
        System.out.println("Devon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // String name[] = new String[n];
        // int score[] = new int[n];
        int rank1 = 0;
        int rank2 = 0;
        int rank3 = 0;
        String name1 = null;
        String name2 = null;
        String name3 = null;
        for (int i = 0; i < n; i++) {
            String name = input.next();
            int score = input.nextInt();
            if (score > rank3) {
                rank3 = score;
                name3 = name;
                if (score > rank2) {
                    rank3 = rank2;
                    name3 = name2;
                    rank2 = score;
                    name2 = name;
                    if (score > rank1) {
                        rank2 = rank1;
                        name2 = name1;
                        rank1 = score;
                        name1 = name;
                    }
                }
            }
        }
        // for(int i = 0; i < n; i++)
        // {
        // if(score[i] > rank3)
        // {
        // rank3 = score[i];
        // name3 = name[i];
        // if(score[i] > rank2)
        // {
        // rank3 = rank2;
        // name3 = name2;
        // rank2 = score[i];
        // name2 = name[i];
        // if(score[i] > rank1)
        // {
        // rank2 = rank1;
        // name2 = name1;
        // rank1 = score[i];
        // name1 = name[i];
        // }
        // }
        // }
        // }
        System.out.println();
        System.out.println(rank1 + rank2 + rank3);
        System.out.println("Rangking 1 = " + name1);
        System.out.println("Rangking 2 = " + name2);
        System.out.println("Rangking 3 = " + name3);

    }
}