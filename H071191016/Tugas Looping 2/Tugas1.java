import java.util.Scanner;

class Tugas1{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int base = yuk.nextInt();
        int pangkat = yuk.nextInt();
        int a = 1;
        System.out.println("Base = "+ base +"\nPangkat = "+ pangkat);

        for (int i = 1; i <= pangkat; i++){
                a = a * base;
            }
        System.out.printf("%d^%d = %d", base,pangkat,a);
        yuk.close();
    }
}