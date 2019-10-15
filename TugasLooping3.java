import java.util.Scanner;
class TugasLooping3{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;
        System.out.print("Bilangan Ganjil = ");
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                sum++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Banyak Bilangan Ganjil = " + sum);

    }
}