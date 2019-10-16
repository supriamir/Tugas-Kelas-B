import java.util.Scanner;
class ProblematicStudent{
    public static void main(String[] args) {
        Scanner putt = new Scanner (System.in);
        int kasus = putt.nextInt();
        int students;
        int[] problem = new int[kasus];
        int[] sum = new int[kasus];

        //input mahasiswa dan nilai sebanyak kasus
        for(int i = 0; i < kasus; i++){
            students = putt.nextInt();
            int[] score = new int[students];
            for (int j = 0; j < students; j++){
                score[j] = putt.nextInt();
                sum[i] += score[j];
            }
            sum[i] /= students;
            for (int k = 0; k < students; k++){
                if (score[k] < sum[i]){
                    problem[i]++;
                }
            }
        }
        
        for(int i = 0; i < kasus; i++){
            System.out.println(problem[i]);
        }        
    }
}