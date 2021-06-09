public class Main {
    public static void main(String[] args) {
        String mystring = new String();
        mystring = "babad";
        byte[] mybytes = mystring.getBytes();
        int size = mybytes.length;
        byte[] reversed = new byte[size];
        for(int i=0;i<size;i++){
            reversed[i] = mybytes[size - i - 1];
        }
        System.out.print("The reversed String is  "+new String(reversed));
    }

}
