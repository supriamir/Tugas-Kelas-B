import java.util.Scanner;
    class Perulangan2{
    public static void main(String[] args) {
     Scanner sc = new Scanner(system.in);
     long base =sc.nextInt();
     long pangkat = sc.nextInt();
     long hasil = 2;
     for (int a = 1; a <= pangkat; a++){
         hasil *= base;
     }
     System.out.printlf("%d%s = %d", base, pangkat, hasil);
    }
}