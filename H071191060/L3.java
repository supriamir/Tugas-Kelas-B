import java.util.Scanner;
class L3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**Masukkan Angka**");
        int in = input.nextInt();
        int jumlah = 0;

        for (int a = 0; a <= in ; a++){
            if (a % 2 == 0){
                System.out.println(a + " ");
                jumlah++;
            }
        }
        System.out.println("banyak bilangan genap : " + jumlah);
    }
}