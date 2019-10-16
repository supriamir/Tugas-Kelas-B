import java.util.Scanner;
class NumbersTriangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int input[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++) {
      for(int j = 0 ; j <= i ; j++) {
        input[i][j] = in.nextInt();
      }
    }
    int maindex = 0;
    int leftdex = 0;
    int rightdex = 0;
    int leftsum = input[maindex][leftdex] + input[maindex+1][leftdex];
    int rightsum= input[maindex][rightdex] + input[maindex+1][rightdex+1];
    rightdex = 1;
    for(maindex = maindex + 1 ; maindex < n - 1 ; maindex++) {
      if(leftsum + input[maindex+1][leftdex] >= leftsum + input[maindex+1][leftdex+1]) {
        leftsum += input[maindex+1][leftdex];
        leftdex = leftdex;
      }
      else {
        leftsum += input[maindex+1][leftdex+1];
        leftdex = leftdex + 1;
      }
      if(rightsum + input[maindex+1][rightdex] >= rightsum + input[maindex+1][rightdex+1]) {
        rightsum += input[maindex+1][rightdex];
        rightdex = rightdex;
      }
      else {
        rightsum += input[maindex+1][rightdex+1];
        rightdex = rightdex + 1;
      }
    }
    if(rightsum > leftsum) {
      System.out.println(rightsum);
    }
    else {
      System.out.println(leftsum);
    }
  }
}