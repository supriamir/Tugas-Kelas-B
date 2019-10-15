import java.util.Scanner;

class Looping3 {
    public static void main(String[] args) {
        Scanner looping = new Scanner (System.in);
        System.out.print("N = ");
        int N = looping.nextInt();
        System.out.print("Bilangan ganjil = ");
        int odd = 0;

        for (int i = 1; i <= N; i+=2) {
            System.out.print(i+",");
            odd += 1;
        }
                System.out.println("\nBanyak bilangan ganjil = "+ odd);
            }
        }
