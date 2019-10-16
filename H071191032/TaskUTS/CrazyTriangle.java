import java.util.Scanner;
class CrazyTriangle{
  public static void main(String[] args) {
    Scanner ardnn = new Scanner(System.in);
    int n = ardnn.nextInt();
    int input[][] = new int[n][n];
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j <= i ; j++){
        input[i][j] = ardnn.nextInt();
      }
    }

    int mainWay = 0;
    int leftWay = 0;
    int rightWay = 0;
    int sumLeft = input[mainWay][leftWay] + input[mainWay+1][leftWay];
    int sumRight= input[mainWay][rightWay] + input[mainWay+1][rightWay+1];
    rightWay = 1;

    for(mainWay = mainWay + 1 ; mainWay < n - 1 ; mainWay++){
      if(sumLeft + input[mainWay+1][leftWay] >= sumLeft + input[mainWay+1][leftWay+1]){
        sumLeft += input[mainWay+1][leftWay];
        leftWay = leftWay;
      }
      else{
        sumLeft += input[mainWay+1][leftWay+1];
        leftWay = leftWay + 1;
      } if(sumRight + input[mainWay+1][rightWay] >= sumRight + input[mainWay+1][rightWay+1]){
        sumRight += input[mainWay+1][rightWay];
        rightWay = rightWay;
      }
      else{
        sumRight += input[mainWay+1][rightWay+1];
        rightWay = rightWay + 1;
      }
    }

    if(sumRight > sumLeft) {
      System.out.println(sumRight);
    } else{
      System.out.println(sumLeft);
    }
  }
}