import java.util.Scanner;

public class Tugas06 {

    public static void main(String[] args) {
    Scanner sep = new Scanner (System.in);
    int n = sep.nextInt();
    int array [][] = new int [n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= 1; j++) {
            array[i][j] = sep.nextInt();
        }
    }
    int maindex = 0;
    int dexKiri = 0;
    int dexKanan = 0;
    int sumKiri = array[maindex][dexKiri] + array[maindex+1][dexKiri];
    int sumKanan = array[maindex][dexKanan] + array[maindex+1][dexKanan+1];
    dexKanan = 1;

    for (maindex= maindex+1;maindex<n-1; maindex++) {
        if (sumKiri + array[maindex+1][dexKiri] >= sumKiri + array[maindex+1][dexKiri+1]){
            sumKiri += array[maindex+1][dexKiri];
            dexKiri = dexKiri;
        }else{
            sumKiri += array[maindex+1][dexKiri+1];
            dexKiri = dexKiri+1;
        }
        if (sumKanan + array[maindex+1][dexKanan] >= sumKanan+array[maindex+1][dexKanan+1]){
            sumKanan += array[maindex+1][dexKanan];
            dexKanan = dexKanan;
        }else{
            sumKanan += array[maindex+1][dexKanan+1];
            dexKanan = dexKanan+1;
        }
    }
    if (sumKanan>sumKiri){
        System.out.println("\n" + sumKanan);
    }else{
        System.out.println("\n" + sumKiri);
    }
  }
}
