import java.util.Scanner;
class TugasLooping01{
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        System.out.print("N = ");
        int n = ka.nextInt();
        System.out.println("Faktor dari " + n + " adalah ");

        for (int i=1; i<= n; i++){
            if(n%i==0){
                System.out.printf("%d,", i);
            }
        }
    }
    
}