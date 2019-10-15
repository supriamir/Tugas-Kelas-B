class Tugas3{
    public static void main(String[] args) {
        int y;
        double x;
        double z;
        System.out.println("Rumus 1");
        for (int i = 0; i <= 50; i+=5){
            y = 4*i + 1;
            System.out.printf("x = %d , y = %d\n" , i, y);
        }
        System.out.println("\nRumus 2");
        for (double j = 1; j<= 10; j++){
            x = Math.sqrt(j) - 1;
            System.out.printf("x = %.2f , y = %.2f\n" , j, x); 
        }
        System.out.println("\nRumus 3");
        for (double k = 1; k<= 5; k=k+0.5){
            z = 5*k*k + 3*k -2;
            System.out.printf("x = %.2f , y = %.2f\n" , k, z);
        }
    }
}