import java.util.Scanner;

public class TugasForLoop4{
    public static void main(String[] args){

        Scanner raf = new Scanner(System.in);

        System.out.println("Input: ");
        

        //int b,c,d,e;
     
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        for(int i = 1; i <= 5; i++){
            int angka = raf.nextInt();
                if((angka  % 2 == 1 || angka % 2 == -1) && angka < 0){
                    ganjil++;
                    negatif++;
                }
                else if(angka % 2 == 0 && angka >= 0){
                    genap++;
                    positif++;
                }
                else if(angka % 2 == 0 && angka < 0){
                    genap++;
                    negatif++;
                }
                else if((angka  % 2 == 1 || angka % 2 == -1) && angka >= 0){
                    ganjil++;
                    positif++;
                }
        }

        System.out.println(genap);
        System.out.println(ganjil);
        System.out.println(positif);
        System.out.println(negatif);
        
    }
}