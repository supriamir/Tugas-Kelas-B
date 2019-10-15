import java.util.Scanner;
class No12{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int h[]= new int[n];
        String colour[] = new String[n];

        for (int i =0; i<n; i++){
            h[i]= sc.nextInt();
            colour [i] = sc.next();
        }
        int size = sc.nextInt();
        String whatColour = sc.next();

        for(int i = 0; i<n ; i++){
            if(h[i]==size && colour[i].equalsIgnoreCase(whatColour)) {
                System.out.println("Sepatu ukuran "+size+" dengan warna "+whatColour+" berada pada urutan "+(i+1));
            }
        }

    }
}