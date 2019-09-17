import java.util.Scanner;

public class TugasLooping04 {
public static void main(String[] args) {
    Scanner ka = new Scanner(System.in);
    int genap = 0;
    int ganjil = 0;
    int positif = 0;
    int negatif = 0;
    System.out.println("Masukkan angka = ");
    for (int x =1; x<= 5; x++){
        int angka = ka.nextInt();
        int ganjilGenap = angka%2 == 0 ? genap++ : ganjil++;
        int positifNegatif = angka > 0? positif++ : negatif++;
    }
    System.out.println(genap + " bilangan genap");
    System.out.println(ganjil + " bilangan ganjil");
    System.out.println(positif + " bilangan positif");
    System.out.println(negatif + " bilangan negatif");
}
  

    
}