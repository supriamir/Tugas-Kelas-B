import java.util.Scanner;
class TLooping1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cetak semua faktor dari bilangan N
        System.out.println("N ");
        int N = sc.nextInt();
        System.out.println("Faktor dari " +N+ " adalah ");
        for (int i = 1; i<=4 ; i++){
            if (N%i==0){
                System.out.print(i+",");
            }
        sc.close();
        }
    }
}