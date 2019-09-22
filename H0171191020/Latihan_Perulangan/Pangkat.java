import java.util.Scanner;

class Pangkat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input Base\t: ");
        double base = in.nextDouble();
        System.out.print("Input Pangkat\t: ");
        int pangkat = in.nextInt();
        in.close();
        double base2 = base;
        int a = 1;
        
        System.out.printf("%.0f ^ %d = ", base , pangkat);
        if (pangkat > 0) {
            while (a < pangkat) {
                base = base*base2;
                a++;
            } System.out.printf("%.0f\n", base);
        } else if (pangkat < 0) {
            pangkat = pangkat * -1;
            while (a < pangkat) {
                base = base*base2;
                a++;
            } System.out.printf("%.3f\n", (1/base));
        } else {
            base = base/base2;
            System.out.printf("%.0f\n", base);
        }
    }
}