import java.util.Scanner;

public class TugasLooping2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai = in.nextInt(),i,hasil;
        int sum = 0;
        in.close();
        
        for(i = 1; i <= nilai; i++){
            hasil = nilai % i ;
            if(hasil == 0){
                sum += i;
            }
        }
        System.out.println("Jumlah Faktor dari " +nilai+ " adalah " +sum);
    }
}