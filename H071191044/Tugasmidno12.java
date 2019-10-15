package ecl;

import java.util.Scanner;

public class Tugasmidno12 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int n= xx.nextInt();
		int [] sepatu= new int[n];
		int i;
		String [] warna= new String[n];
		boolean kosong= true;
			for(i=0; i<n; i++) {
				System.out.print("Sepatu ke-"+(i+1)+" ");
				sepatu[i]= xx.nextInt();
				System.out.print("Warna : ");
				warna[i]= xx.next();
			}
			System.out.print("Masukkan ukuran sepatu : ");
			int x= xx.nextInt();
			System.out.print("Warna sepatu yang diinginkan : ");
			String x2= xx.next();
			for(i=0; i<n; i++) {
				if(sepatu[i]==x && warna[i].equalsIgnoreCase(x2)) {
					System.out.print("Sepatu berada pada urutan-"+(i+1));
					kosong=false;
					break;
			}
			}
			if(kosong==true) {
				System.out.println("Sepatu ukuran "+x+" warna "+x2+" kosong");
			}
			}
			}
