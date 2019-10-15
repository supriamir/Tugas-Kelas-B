import java.util.Scanner;
/**
 * Tugas07
 */
public class Tugas07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        String[] name = new String[count];
        int[] score = new int[count];
        int result, max1, max2, max3, req1, req2, req3;
        max1 = 0;
        max2 = 0;
        max3 = 0;
        req1 = 0;
        req2 = 0;
        req3 = 0;
        for (int i = 0; i < count; i++) {
            name[i] = input.next();
            score[i] = input.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (score[i]>max1) {
                max1 = score[i];
                req1 = i;
            }
        }
        for (int i = 0; i < count; i++) {
            if (score[i]>max2 && i != req1) {
                max2 = score[i];
                req2 = i;
            }
        }
        for (int i = 0; i < count; i++) {
            if (score[i]>max3 && i != req1 && i != req2) {
                max3 = score[i];
                req3 = i;
            }
        }
        result = (max1+max2+max3);
        System.out.println(result);
        System.out.println(name[req1]);
        System.out.println(name[req2]);
        System.out.println(name[req3]);
        input.close();
    }
}