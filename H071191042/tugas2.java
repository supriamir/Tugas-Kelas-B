import java.util.Scanner;
class tugas2{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka");
        int nilai = a.nextInt();
        int sum = 0;
        for (int z = 1; z <= nilai; z++) {

            if (nilai %z==0) {
                sum += z;
            }
        }
        System.out.println("sum= " + sum);
        
    }

}