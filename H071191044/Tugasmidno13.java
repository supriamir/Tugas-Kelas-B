package ecl;

import java.util.Scanner;

public class Tugasmidno13 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int Jkelas= xx.nextInt();
		int [] Jsiswa= new int[Jkelas];
		int [] kelas= new int[Jkelas];
		int [] rata2= new int[Jkelas];
		int [] array= new int[Jkelas];
		int [][] siswa= new int[Jkelas][10000];
		int i, j, k, hasil, pembagihasil , remed;
		hasil= array[0]; pembagihasil= array[0]; remed= array[0];
			
			for(i=0; i<Jkelas; i++) {
				Jsiswa[i]= xx.nextInt();
				for(j=0; j<Jsiswa[i]; j++) {
					siswa[i][j]=xx.nextInt();
				}
				}
			
			for(i=0; i<Jkelas; i++) {
				hasil=0;
				pembagihasil=0;
				remed=0;
				System.out.println();
				for(j=0; j<Jsiswa[i]; j++) {
					hasil+=siswa[i][j];
					pembagihasil=Jsiswa[i];
				}
				for(k=0; k<Jsiswa[i]; k++) {
					rata2[i]=(hasil/pembagihasil);
					if(siswa[i][k]<rata2[i]) {
						remed++;
				}
				}
				System.out.print(remed+" ");
				}
				}
				}
