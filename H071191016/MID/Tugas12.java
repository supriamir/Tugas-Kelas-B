import java.util.Scanner;

class Tugas12{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        int[] ukuran = new int[n];
        String[] warna = new String[n];
        
        for(int i = 0; i < n; i++){
                ukuran[i] = yuk.nextInt(); //ukuran sepatu yang ada di toko
                warna[i] = yuk.next(); //warna sepatu yang ada di toko
        }
        int x = yuk.nextInt(); //ukuran sepatu Winda
        String colour = yuk.next(); //Warna Sepatu Winda
        
        for(int i = 0; i < n; i++){
            if(ukuran[i] == x && warna[i] != colour){
                System.out.println("Sepatu ditemukan pada urutan ke "+ i);
            }
            else{
                System.out.println("Bukan Sepatu yang diinginkan");
            }
        }
    }
}