import java.util.Scanner;
class L2{
    public static void main(String[] args) {
        Scanner ngoding = new Scanner(System.in);
        int PO = 0;
        int angka =ngoding.nextInt();
        System.out.println("Faktor dari " + angka + " yaitu :");
        System.out.println("============================");
        for(int a = 1; a <= angka; a++){
            if (a%2 == 0){
                System.out.print(a +" ");
                PO += a;
            }
        }
    System.out.println("jumlah :" +PO);
    }
}