import java.util.Scanner;
class No10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<N; i++){
            for(int j=0; j<M;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i=0;i<N;i++){
            for (int j = M-1; j>=0;j--){
                System.out.print(a[j][i]+ " ");
            }
            System.out.println();
        }
    }
}