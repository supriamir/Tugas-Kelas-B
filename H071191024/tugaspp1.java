import java.util.Scanner;

class tugaspp1{
    public static void main(String[] args) {
        Scanner rv = new Scanner(System.in);
        int base = rv.nextInt();
        int pangkat = rv.nextInt();
        int a = 1;
        System.out.println("Base = "+ base +"\nPangkat = "+ pangkat);

        for (int i = 1; i <= pangkat; i++){
                a = a * base;
            }
        System.out.printf("%d^%d = %d", base,pangkat,a);
        rv.close();
    }
}