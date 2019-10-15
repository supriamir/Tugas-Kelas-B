import java.util.Scanner;

public class TugasLooping1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai = in.nextInt(),i,hasil;
        in.close();
        for(i = 1; i <= nilai; i++){
            hasil = nilai % i ;
            if(hasil == 0){
                System.out.print(i+ ",");
            }
        }
    }
}