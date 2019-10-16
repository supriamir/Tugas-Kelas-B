import java.util.Scanner;
class GroupPairs{
    public static void main(String[] args) {
        Scanner helehh = new Scanner (System.in);
        int member = helehh.nextInt();
        String[] name = new String[member];
        int[] score = new int [member];
        int total = 0;
        int rank1 = 0;
        int rank2 = 0;
        int rank3 = 0;
        String name1 = null;
        String name2 = null;
        String name3 = null;
        
        for ( int i = 0; i < member; i++) {
            name [i] = helehh.next();
            score [i] = helehh.nextInt();
            total += score[i];
        }

        for ( int i = 0; i < member; i++){
            if ( score[i] > rank3) {
                rank3 = score[i];
                name3 = name[i];
                if ( score[i] > rank2){
                    rank3 = rank2;
                    name3 = name2;
                    rank2= score[i];
                    name2 = name[i];
                    if ( score[i] > rank3){
                        rank2 = rank1;
                        name2 = name1;
                        rank1 = score[i];
                        name1 = name[i];
                    }
                }
            }
        }

        System.out.println(total);
        System.out.println(name1 + " " + rank1);
        System.out.println(name2 + " " + rank2);
        System.out.println(name3 + " " + rank3);
    }
}