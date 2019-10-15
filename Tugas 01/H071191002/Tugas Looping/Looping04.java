import java.util.Scanner;
class Looping04{
    public static void main(String[] args) {
        int ganjil=0;
        int genap=0;
        int positif=0;
        int negatif=0;

        Scanner input = new Scanner (System.in);
            
            for(int i=0; i<5; i++){
                int n = input.nextInt();
                if(n%2==0 && n>0){
                    genap++;
                    positif++;
                } else if(n%2==0 && n<0){
                    genap++;
                    negatif++;
                } else if(n%2!=0 && n>0){
                    ganjil++;
                    positif++;
                }else if(n%2!=0 && n<0){
                    ganjil++;
                    negatif++;
                }else{
                    genap++;
                }
            } 
            System.out.printf("%d bilangan genap\n",genap);
            System.out.printf("%d bilangan ganjil\n",ganjil);
            System.out.printf("%d bilangan positif\n",positif);
            System.out.printf("%d bilangan negatif\n",negatif);
        
    }
}