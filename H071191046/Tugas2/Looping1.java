import java.util.Scanner;
class Looping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base = ");
        int base = sc.nextInt();
        System.out.println("Pangkat = ");
        int pangkat = sc.nextInt();
        sc.close();
        double jumlah = 1;
        if (pangkat >= 0) {
            for (int a=1; a <= pangkat; a++){
                jumlah = jumlah*base;
            }
            System.out.printf("%d ^ %d = %.0f", base, pangkat, jumlah);
        } else if (pangkat < 0) {
            for (int a=-1; a >= pangkat; a--) {
                jumlah = jumlah*base;
            }
            System.out.println(base + "^" + pangkat + "*" + (1/jumlah));
        }
    }
}