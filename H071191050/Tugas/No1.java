import java.util.Scanner;
class No1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int h[] = new int[n]; 
    String colour[] = new String[n]; 
    boolean found = false;
    for(int i = 0; i < n; i++)
    {
      h[i] = sc.nextInt(); 
      colour[i] = sc.next(); 
    }
    int x = sc.nextInt(); 
    String colourx = sc.next(); 
    for(int i = 0; i < n; i++)
    {
      if(h[i] == x && colour[i].equalsIgnoreCase(colourx))
      {
        found = true;
        System.out.println("sepatu berwarna " + colour[i] + " berukuran " + h[i] + " ditemukan pada indeks ke " + i);
      }
      found = false;
    }
  }
}