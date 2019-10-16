class Tugas3 {
    public static void main(String[] args) {
        int x = 0;
        double y = 0;
        double z = 0;

        System.out.println("Rumus 1");
        for (int i = 0; i <= 50; i = i + 5) {
            x = 4 * i + i;
            System.out.printf("y=%d x=%d ", i, x);
        }

        System.out.println("Rumus 2");
        for (int i = 1; i <= 10; i++) {
            y = Math.sqrt(i) - 1;
            System.out.printf("y=%.2f x = %.2f ", i, y);
        }

        System.out.println("Rumus 3");
        for (double i = 1; i <= 5; i += 0.5) {
            z = (5 * i * i) + (3 * i) - 2;
            System.out.printf("y=%.2f x=%.2f ", i, z);
        }
    }
}