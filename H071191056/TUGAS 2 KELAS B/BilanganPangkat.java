import java.util.Scanner;

public class BilanganPangkat{

    public static void main(String[] args) {
        
        Scanner raf = new Scanner (System.in);

        System.out.println("Masukkan Base");
        int base = raf.nextInt();

        System.out.println("Masukkan Pangkat");

        int pangkat = raf.nextInt();

        int angka1 = 0;
        double angka2 = 1;

        raf.close();

        if (pangkat<0){
            while (angka1 > pangkat){
                angka2 = angka2 * base;
                angka1--;
            }
            System.out.printf("%.2f", 1/angka2);
        }
        else{
            while(angka1 < pangkat){
                angka2 = angka2*base;
                angka1++;
            }
            System.out.println(angka2);
        }
    }
}