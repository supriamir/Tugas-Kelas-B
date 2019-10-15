import java.util.Scanner;
class TLooping4 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        int pos = 0;
        int neg = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5 ; i++){
            int n = sc.nextInt();
            if (n%2==0 && n>0){
                even++;
                pos++;
            } else if (n%2==0 && n<0){
                neg++;
                even++;
            } else if (n%2!=0 && n>0){
                odd++;
                pos++;
            } else if (n%2!=0 && n<0){
                odd++;
                neg++;
            } else {
                even++;
            }
        }
        System.out.printf("%d Bilangan genap%n", even);
        System.out.printf("%d Bilangan ganjil%n", odd);
        System.out.printf("%d Bilangan positif%n", pos);
        System.out.printf("%d Bilangan negatif%n", neg);
    }
}