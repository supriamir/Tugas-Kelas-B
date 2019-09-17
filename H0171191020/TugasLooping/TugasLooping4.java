import java.util.Scanner;

public class TugasLooping4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        for (int i = 0; i<5; i ++){
            int a = in.nextInt();
            if (a < 0){
                negatif++;
            }
            if (a > 0){
                positif++;
            }
            if (a%2==0){
                genap++;
            }
            if (a%2!=0){
                ganjil++;
            }
        }
        in.close();
        System.out.println(genap+ " Bilangan Genap");
        System.out.println(ganjil+ " Bilangan Ganjil");
        System.out.println(positif+ " Bilangan Positif");
        System.out.println(negatif+ " Bilangan Negatif");
    }
}