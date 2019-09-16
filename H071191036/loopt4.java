import java.util.Scanner;
public class loopt4 {

    public static void main(String[] args) {
        Scanner looping = new Scanner (System.in);
       int ganjil = 0;
       int genap = 0;
       int positif = 0;
       int negatif = 0;
       System.out.print("masukkan angka = ");
       for (int x = 1; x<=5; x++){
           int angka = looping.nextInt();
           int ganjilGenap = angka%2 == 0 ? genap++ : ganjil++;
           int positifNegatif = angka> 0 ? positif++ : negatif++;

       }
       System.out.println(genap + " Bilangan genap");
       System.out.println(ganjil + " Bilangan ganjil");
       System.out.println(positif + " Bilangan Positif");
       System.out.println(negatif + " Bilangan Negatif");

    }
}