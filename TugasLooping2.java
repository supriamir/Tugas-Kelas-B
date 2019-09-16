import java.util.Scanner;
class TugasLooping2{
    public static void main(String[]args){
        Scanner lp = new Scanner(System.in);
        int n = lp.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum = sum +i;
            }
        }
        System.out.println("sum = "+ sum );  
    }
}