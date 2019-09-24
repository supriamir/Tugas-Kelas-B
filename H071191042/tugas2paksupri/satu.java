import java.util.Scanner;
class satu{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        int angka = pew.nextInt();
        int pangkat = pew.nextInt();
        int i;
        int hasil = 1;
        for (i = 0;i<pangkat;i++){
            hasil = hasil * angka;
        }
        System.out.println(angka + "^" + pangkat + "=" + hasil);
    }
}