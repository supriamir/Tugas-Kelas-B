class tugaspp2{
    public static void main(String[] args) {
        int password = 1234;
        
        for (int i = 0; i <= password; i++){
            if (i != 1234){
                System.out.println(i +" Password Anda Salah");
            }
            else{
                System.out.println(i +" Password Anda Benar");
            }
        }
    }
}