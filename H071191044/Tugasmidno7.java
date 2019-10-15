package ecl;

import java.util.Scanner;

	class Tugasmidno7 {
		public static void main(String [] args) {
			Scanner xx= new Scanner(System.in);
			System.out.print("Jumlah orang : ");
			int  jumlahorang= xx.nextInt();
			String [] nama= new String[jumlahorang];
			int [] skor= new int[jumlahorang];
			int [] array= new int[jumlahorang];
			int i, j, hasil, maks, maks2, maks3, syarat1, syarat2, syarat3;
			maks=array[0]; maks2=array[0]; maks3=array[0]; 
			syarat1=array[0]; syarat2=array[0];syarat3= array[0];
			
				for(i=0; i<jumlahorang; i++) {
					nama[i]= xx.next();
					skor[i]= xx.nextInt();
				}	 
				for(i=0; i<jumlahorang; i++) {
						if(skor[i]>maks) {
							maks=skor[i];
							syarat1=i;
				} 
				}
				for(i=0; i<jumlahorang; i++) {
					if(skor[i]>maks2 && i!=syarat1) {
						maks2=skor[i];	
						syarat2=i;
				}
				}
				for(i=0; i<jumlahorang; i++) {
					if(skor[i]>maks3 && i!=syarat1 && i!=syarat2) {
						maks3=skor[i];
						syarat3=i;
				}
				}
				hasil=(maks+maks2+maks3);
				System.out.print(hasil);
				System.out.print("\n"+nama[syarat1]+"\n"+nama[syarat2]+"\n"+nama[syarat3]);
				}
				}
