import java.util.Scanner;
public class Nomorr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
        for (int x = 0; x < 5; x++) {
            int angka = sc.nextInt();
            if (angka%2==0) {
                genap++;
                if (angka > 0) {
                    positif++;
                }
                else {
                    negatif++;
                }
            }
            else {
                ganjil++;
                if (angka > 0) {
                    positif++;
                }
                else {
                    negatif++;
                }
            }
        }
        System.out.println(genap + " Bilangan genap ");
        System.out.println(ganjil + " Bilangan ganjil ");
        System.out.println(positif + " Bilangan positif ");
        System.out.println(negatif + " Bilangan negatif ");
    }
}