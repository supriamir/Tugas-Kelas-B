import java.util.Scanner;
class Tugas1{
    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);
        System.out.print("Base = ");
        int base = ka.nextInt();
        System.out.print("Pangkat = ");
        int pangkat = ka.nextInt();
        int i = 0;
        double x =1;
        ka.close();
        if (pangkat > 0){
        while (i<pangkat){
            x = x*base;
            i++;
        }
        System.out.print(x);
    }else{
        while(i > pangkat){
            x = x*base;
            i--;
        }
        System.out.printf("%.2f",1/x);
    }
}
}