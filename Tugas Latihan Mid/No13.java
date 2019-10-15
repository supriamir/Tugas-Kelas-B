import java.util.Scanner;
class No13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        float average[] = new float[T];
        int error[] = new int[T];
        int sum = 0;
        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            int value [] = new int [N];
            for (int j=0; j<N; j++){
                value[j] = sc.nextInt();
                sum+=value[j];
            }
            average[i] = (float) sum/(N*1f);
            sum=0;
            error[i]=0;

            for (int k = 0; k<N;k++)
            {
                error[i]+=value[k]<average[i]?1:0;
            }

        }
        System.out.println();
        for (int i=0; i<T; i++){
            System.out.println(error[i]);
        }
    }
}