import java.util.Scanner;
class pangkat{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int nilai = input.nextInt();
        System.out.println("masukkan pangkat : ");
        int pkt = input.nextInt();
       
        int h = 1;
       
        for (int i = 1; i <= pkt;i++){
        h = h * nilai;
        }
        System.out.println(nilai+ " ^ " + pkt + " = " +h);

    }

}