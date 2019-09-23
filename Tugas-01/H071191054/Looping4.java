import java.util.Scanner;

class Looping4 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        System.out.print("Angka = ");
        for (int x = 1; x <= 5; x++) {
            int angka = sl.nextInt();
            int ganjilgenap = angka % 2 == 0 ? genap++ : ganjil++;
            int posneg = angka > 0 ? positif++ : negatif++;
        }
        System.out.println(genap + " Bilangan genap");
        System.out.println(ganjil + " Bilangan ganjil");
        System.out.println(positif + " Bilangan positif");
        System.out.println(negatif + " Bilangan negatif");
    }
}