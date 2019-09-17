import java.util.Scanner;
class TugasLooping03{
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        System.out.print("N = ");
        int n = ka.nextInt();
        System.out.print("Bilangan ganjil = ");
        int odd = 0;

        for (int i=1 ; i <= n; i+=2){
            System.out.print(i + ",");
            odd += 1;
        }
        System.out.println("\nBanyak bilangan ganjil = " + odd);
    }
}