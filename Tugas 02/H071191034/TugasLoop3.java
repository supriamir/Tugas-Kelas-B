class TugasLoop3 {
    public static void main(String[] args) {
        int x;
        double y;
        double z;
        
        System.out.println("Rumus 1 :");
        for (int i=0; i<=50; i+=5){
            x = (4*i)+1;
            System.out.printf("x=%d, y=%d \n",i,x);
        }

        System.out.println("\nRumus 2 :");
        for (double i = 1; i<=10; i++){
            y = Math.sqrt(i)-1;
            System.out.printf("x=%.2f, y=%.2f \n",i,y);
        }

        System.out.println("\nRumus 3 :");
        for (double i = 1; i<=5; i+=0.5){
            z = (5*Math.pow(i,2))+(3*i)-2;
            System.out.printf("x=%.2f, y=%.2f \n",i,z);
        }
    }
}