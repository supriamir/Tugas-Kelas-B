import java.util.Scanner;

class TugasLooping3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt(),i,hasil;
        int ganjil=0;
        in.close();

        System.out.print("Bilangan Ganjil : ");
        for(i=1 ; i <= input ; i++){
            hasil = i%2;
            if (hasil != 0){
                ganjil++;
                System.out.printf("%d " ,i);
            }
        } System.out.println("\nBanyak Bilangan Ganjil : " +ganjil);
    }
}