import java.util.Scanner;
class FindShoes{
    public static void main(String[] args) {
        Scanner putt = new Scanner (System.in);
        int size;
        String color;
        boolean finded = false;
        int shoes = putt.nextInt();
        int[] sizeShoes = new int[shoes];
        String[] colorShoes = new String[shoes];

        for(int i = 0; i < shoes; i++){
            sizeShoes[i]= putt.nextInt();
            colorShoes[i] = putt.next();
        }

        System.out.println("Input ukuran dan warna sepatu winda :");
        int sizeWinda = putt.nextInt();
        String colorWinda = putt.next();

        boolean found = false;
        for(int i = 0; i < shoes; i++){
            if( sizeShoes[i] ==sizeWinda && colorWinda.equals(colorShoes[i])){
                System.out.println("Ukuran sepatu berada di index ke " + i);
                finded = true;
                found = true;
            }
            else{
                finded = false;
            }
        }

        if(!found){
            System.out.println("Sepatu tidak ditemukan");
        }
    }
}