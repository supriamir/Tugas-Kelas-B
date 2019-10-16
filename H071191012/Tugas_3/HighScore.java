import java.util.Scanner;
public class HighScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String name[] = new String[n];
        int score[] = new int[n];

        for (int i = 0; i < n-1; i++) {
            name[i] = in.next();
        }
        for (int j = 0; j < n-1; j++) {
            score[j] = in.nextInt();
        }
        
        String name1 = null;
        String name2 = null;
        String name3 = null;
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

    for(int i = 0; i < score.length; i++) {
        if(score[i] > score3) {
        score3 = score[i];
        name3 = name[i];
        
            if(score[i] > score2) {
            score3 = score2;
            name3 = name2;
            score2 = score[i];
            name2 = name[i];
            
                if(score[i] > score1) {
                score2 = score1;
                name2 = name1;
                score1 = score[i];
                name1 = name[i];
                }
            }
        }
    }
      System.out.println();
      System.out.println(score1 + score2 + score3);
      System.out.println(name1 + " " + score1);
      System.out.println(name2 + " " + score2);
      System.out.println(name3 + " " + score3);

    }
}