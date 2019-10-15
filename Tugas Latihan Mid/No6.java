import java.util.Scanner;
class No6{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int [][] triangle = new int [n][n];
    
    for (int i=0; i<n; i++){
      for (int j=0; j<=i; j++){
        triangle [i][j] = sc.nextInt();
      }
    }

    int row = 0;
    int leftCl=0;
    int rightCl=0;
    int leftClSum = triangle[row][leftCl]+triangle[row+1][leftCl];
    int rightClSum = triangle[row][rightCl]+triangle[row+1][rightCl+1];
    rightCl =1;

    for(row=row+1;row<n-1;row++){
      if (leftClSum + triangle[row+1][leftCl] >= leftClSum + triangle[row+1][leftCl+1]){
        leftClSum += triangle[row+1][leftCl];
        leftCl=leftCl;
      }else{
        leftClSum += triangle[row+1][leftCl+1];
        leftCl = leftCl+1;
      }
      if (rightClSum + triangle[row+1][rightCl] >= rightClSum + triangle[row+1][rightCl+1])
      {
        rightClSum += triangle[row+1][rightCl];
        rightCl = rightCl;
      }else{
        rightClSum += triangle[row+1][rightCl+1];
        rightCl = rightCl + 1;
      }
  }
  if (leftClSum >= rightClSum){
    System.out.println(leftClSum);
  }else{
    System.out.println(rightClSum);
  }
}
}