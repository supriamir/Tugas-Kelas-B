import java.util.Scanner;
public class Perulangan_1 {

    public static void main(String[] args) {
        Scanner pp = new Scanner (System.in);
        System.out.println("masukkan angka");
        int angka = pp.nextInt();
        System.out.println("masukkan pangkat");
        int pangkat = pp.nextInt();
        int i = 0;
        double j = 1;
        pp.close();

        if (pangkat<0){
            while (i>pangkat){
                j = j*angka;
                i--;
            }
            System.out.printf("%.2f", 1/j);
        }else{
            while(i<pangkat){
                j = j*angka;
                i++;
            }
            System.out.println(j);
        }
    }
}