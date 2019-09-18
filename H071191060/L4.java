import java.util.Scanner;
class L4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        int positif = 0;
        int negatif = 0;
        int nol = 0;
        System.out.println("==================");
        for (int a = 1; a <= 5; a++){
            int input = scan.nextInt();
            if (input % 2 == 0){
                genap++;
            }else{
                ganjil++;
            }
            if (input < 0){
                negatif++;
            }else{
                positif++;
            }
            if (input == 0){
                nol++;
            }
        }
        System.out.println("Bilangan genap :" +genap);
        System.out.println("Bilangan ganjil :" +ganjil);
        System.out.println("Bilangan negatif :" +negatif);
        System.out.println("Bilangan positif :" +positif);
        System.out.println("Bilangan nol :" +nol);
    }
}