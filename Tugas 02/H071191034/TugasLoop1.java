import java.util.Scanner;
class TugasLoop1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Angka
        int a = sc.nextInt();
        //Pangkat
        int b = sc.nextInt();
        int x=1;

        for (int i=1; i<=b; i++){
            x=x*a;
        }
        System.out.printf("%d ^ %d = %d", a, b, x);
        sc.close();
    }
}