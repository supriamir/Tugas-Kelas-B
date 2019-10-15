class Tugas2{
    public static void main(String[] args) {
        int password = 2000;
        
        for (int i = 0; i <= password; i++){
            if (i != 2000){
                System.out.println(i +" Password Anda Salah");
            }
            else{
                System.out.println(i +" Password Anda Benar");
            }
        }
    }
}