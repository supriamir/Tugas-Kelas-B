import java.util.Scanner;
/**
 * Tugas13
 */
public class Tugas13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] studentcount = new int[count];
        int[] classroom = new int[count];
        int[] avg = new int[count];
        int[][] student = new int[count][10000];
        int value, avgvalue, remedial;
        for (int i = 0; i < count; i++) {
            studentcount[i] =  input.nextInt();
            for (int j = 0; j < studentcount[i]; j++) {
                student[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < count; i++) {
            value = 0;
            avgvalue = 0;
            remedial = 0;
            System.out.println();
            for (int j = 0; j < studentcount[i]; j++) {
                value+=student[i][j];
                avgvalue=studentcount[i];
            }
            for (int k = 0; k < studentcount[i]; k++) {
                avg[i]=(value/avgvalue);
                if (student[i][k]<avg[i]) remedial++; 
            }
            System.out.print(remedial+" ");
        }

        input.close();
    }
}