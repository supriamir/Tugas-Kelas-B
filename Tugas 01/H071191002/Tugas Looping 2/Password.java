import java.util.Scanner;
class Password{
  public static void main(String[] args){
    boolean a = true;
    Scanner lol = new Scanner (System.in);

    while(a){
      System.out.print("Masukkan password : ");
      int password = lol.nextInt();
        if(password==2002){
          System.out.println("Password benar");
          break;
        }else{
          System.out.println("Password salah");
        }
    } lol.close();
  }
}
