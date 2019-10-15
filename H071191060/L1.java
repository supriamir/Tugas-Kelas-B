import java.util.Scanner;
class L1{
    public static void main(String[] args) {
        Scanner gas = new Scanner(System.in);
        System.out.println("Masukkan Nilai");
        System.out.println("==============");
        int inpt = gas.nextInt();
        System.out.println("Faktor dari " + inpt + " adalah" );
        for(int a = 1; a <= inpt; a++){
            if (inpt % a == 0){
                System.out.print(a +" ");
            }
        }
    }
}