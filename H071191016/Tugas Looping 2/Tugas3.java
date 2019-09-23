class Tugas3{
    
    public static void main(String[] args) {
        double x = 0;
        
        System.out.println("Soal Nomor 1");
        System.out.println("x \ty");
        for (int i = 0; i <= 50; i+=5){
            x = i;
            double y;
            y =  x * 4 + 1;
            System.out.println(x +"\t"+ y);
        }
        System.out.println("Soal Nomor 2");
        System.out.println("x \ty");
        for (int i = 1; i <= 10; i += 1){
            x = i;
            double y;
            y = Math.sqrt(x) - 1;
            System.out.println(x +"\t"+ y);
        }
        System.out.println("Soal Nomor 3");
        System.out.println("x \ty");
        for (double i = 1; i <= 5; i += 0.5){
            x = i;
            double y;
            y = (5 * x * x ) + ( 3 * x ) - 2;
            System.out.println(x +"\t"+ y);
        }
    }
}