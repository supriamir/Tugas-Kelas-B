import java.util.Scanner;
class TLooping2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int sum = 0;
        for (int x=1; x<=N; x++){
            if (N%x==0){
                sum += x;
            }
        }
        System.out.println("Sum = "+ sum);
        sc.close();
    }
}