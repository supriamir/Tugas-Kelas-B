import java.util.Scanner;

class Tugasno7 {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Masukkan jumlah anggota = ");
        int n = sl.nextInt();
        int rank1 = 0;
        int rank2 = 0;
        int rank3 = 0;

        String nama1 = null;
        String nama2 = null;
        String nama3 = null;
        sl.close();

        for (int i = 0; i < n; i++) {
            String nama = sl.nextInt();
            int nilai = sl.nextInt();

            if (nilai > rank3) {
                rank3 = nilai;
                nama3 = nama;
            }
            if (nilai > rank2) {
                rank3 = rank2;
                nama3 = nama2;
                rank2 = nilai;
                nama2 = nama;
            }
            if (nilai > rank1) {
                rank2 = rank1;
                nama2 = nama1;
                rank1 = nilai;
                nama1 = nama;
            }
        }
        System.out.println();
        System.out.println(rank1 + rank2 + rank3);
        System.out.println(nama1 + " " + rank1);
        System.out.println(nama2 + " " + rank2);
        System.out.println(nama3 + " " + rank3);

    }
}