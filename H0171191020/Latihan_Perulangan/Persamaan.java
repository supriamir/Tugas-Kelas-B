public class Persamaan {
    public static void main(String []args){
        double y1;
        double y2;
        double y3;

        //Nilai X dan Y untuk persamaan ke-1
        System.out.println("Persamaan Ke-1");
        for(double x1 = 0; x1<=50; x1+=5){
            y1 =  4*x1 + 1;
            System.out.printf("x = %.0f , y = %.0f\n",x1,y1);
        }
        //Nilai X dan Y untuk persamaan ke-2
        System.out.println("\nPersamaan Ke-2");
        for(double x2 = 1; x2<=10;x2+=1){
            y2 = Math.sqrt(x2) - 1;
            System.out.printf("x = %.0f , y = %.2f\n",x2,y2);
        }
        //Nilai X dan Y untuk persamaan ke-3
        System.out.println("\nPersamaan Ke-3");
        for(double x3 = 1; x3<=5; x3+=0.5){
            y3 = (5 * x3 *x3) + (3 *x3) - 2;
            System.out.printf("x = %.2f , y = %.2f\n",x3,y3);
        }
    }
}
