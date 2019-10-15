import java.util.Scanner;
class TugasLooping1{
    public static void main(String[]args){
            Scanner lp = new Scanner(System.in);
            int n = lp.nextInt();
            System.out.print("Faktor dari " + n + " adalah : " );

            for(int i=1;i<=n;i++)
            {
                if(n%i == 0)
                {
                     System.out.print(i + " ");
                }
            }
    }
}
