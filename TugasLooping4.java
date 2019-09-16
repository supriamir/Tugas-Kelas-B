import java.util.Scanner;
class TugasLooping4{
    public static void main(String[]args){
        Scanner we = new Scanner(System.in);
        int BilanganGanjil= 0,BilanganGenap=0,BilanganPositif=0,BilanganNegatif=0;
        for(int i=1;i<=5;i++){
            int a=we.nextInt();
            if(a>0){
                BilanganPositif++;
            }else if(a<0){
                BilanganNegatif++;
            }
            if(a%2==0){
                BilanganGenap++;
            }else if(a%2!=0){
                BilanganGanjil++;
            }
        }
        System.out.println("Bilangan Ganjil = " + BilanganGanjil);
        System.out.println("Bilangan Genap = " + BilanganGenap);
        System.out.println("Bilangan Positif = " + BilanganPositif);
        System.out.println("Bilangan Negatif = " + BilanganNegatif);

    }
}