import java.util.Scanner;

class Looping04 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int awal = obj.nextInt();
        int batas = obj.nextInt();
        int sum = 0;

        for (int k = awal; k < batas; k++) {
            if (k % 2 == 1) {
                sum +=k;
            }
        }
        System.out.println("jumlah semua bilangan ganjil : " + sum);
    }
}