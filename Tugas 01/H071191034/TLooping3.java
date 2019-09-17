import java.util.Scanner;
class TLooping3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        System.out.print("Bilangan Ganjil = ");
        int odd = 0;
        for (int x=1 ; x <= N ; x+=2){
            System.out.print(x +",");
            odd += 1;
        }
        System.out.println("\nBanyak Bilangan Ganjil = " + odd);
    }
}