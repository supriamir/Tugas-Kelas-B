import java.util.Scanner;

class Tugas12

{

    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        int n = ka.nextInt();
        int size[] = new int[n]; 
        String colour[] = new String[n]; 
        boolean found = false;

        for (int i = 0; i < n; i++) {
            size[i] = ka.nextInt(); 
            colour[i] = ka.next(); 
        }

        int shoeSize = ka.nextInt(); // ukuran sepatu yang dicari
        String shoeColour = ka.next(); // warna sepatu yang dicari

        for (int i = 0; i < n; i++) {
            if (size[i] == shoeSize && colour[i].equalsIgnoreCase(shoeColour)) {
                found = true;
                System.out.println(
                        "Sepatu berwarna " + colour[i] + " berukuran " + size[i] + " ditemukan pada indeks ke " + i);
            }
            found = false;
        }

    }

}