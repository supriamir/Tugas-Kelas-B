import java.util.Scanner;
/**
 * Tugas7
 */
public class Tugas7 {

    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        int n = ka.nextInt();
        String name1 = null;
        String name2 = null;
        String name3 = null; 
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        if(n>=3){
            for(int i = 0; i < n; i++){
                String nama = ka.next();
                int nilai = ka.nextInt();

                if(name1 == null){
                    name1 = nama;
                    score1 = nilai;
                }else if(name2 == null){
                    if(nilai > score1){
                    name2 = name1;
                    score2 = score1;
                    name1 = nama;
                    score1 = nilai;
                    }else{
                        name2 = nama;
                        score2 = nilai;
                    }
                }else if(name3 == null){
                    if(nilai > score1){
                        name3 = name2;
                        score3 = score2;
                        name2 = name1;
                        score2 = score1;
                        name1 = nama;
                        score1 = nilai;
                    }else if(nilai > score2){
                        name3 = name2;
                        score3 = score2;
                        name2 = nama;
                        score2 = nilai;
                    }else{
                        name3 = nama;
                        score3 = nilai;
                    }
                }else{
                    if(nilai > score1){
                        name3 = name2;
                        score3 = score2;
                        name2 = name1;
                        score2 = score1;
                        name1 = nama;
                        score1 = nilai;
                    }else if(nilai > score2){
                        name3 = name2;
                        score3 = score2;
                        name2 = nama;
                        score2 = nilai;
                    }else if(nilai > score3){
                        name3 = nama;
                        score3 = nilai;
                    }
                }

                }
                System.out.println(score1 + score2 + score3);
                System.out.print(name1+ "\n"+name2+"\n"+name3);
                System.out.println();
            }
            else{
                System.out.println("Inputan kurang");
            }
        }

    }