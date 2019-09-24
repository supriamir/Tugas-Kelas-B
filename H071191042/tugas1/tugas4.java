import java.util.Scanner;
class tugas4{
    public static void main(String[] args) {
        Scanner pew = new Scanner(System.in);
        System.out.println("masukkan angka");
        int positif = 0;
        int nol = 0;
        int negatif = 0;
        int genap = 0;
        int ganjil = 0;
        

        for (int a = 0; a < 5; a++){
            int nilai = pew.nextInt();
            if (nilai %2== 0){
                genap++;
                
            }else {
                ganjil++;
                
            }if ( nilai > 0){
                positif++;
                
            }else{
                negatif++;
                
            }if (nilai == 0){
                nol++;
                
            }
            
           
            
        }
        System.out.println("bilangan genap " + genap);
        System.out.println("bilangan ganjil " + ganjil);
        System.out.println("bilangan positif " + positif);
        System.out.println("bilangan negatif " + negatif);
        System.out.println("nol " + nol);
    }
}