public class Main {
    public static void main(String[] args) {
        String mystring = "Hi how are you";
        System.out.println("Final string : "+Urify(mystring));
    }

    public static String Urify(String mystring){
        for(int i=0;i<mystring.length();i++){
            if(mystring.charAt(i) == ' '){
                mystring = mystring.substring(0,i) + "%20"+mystring.substring(i+1);
            }
        }

        return mystring;
    }
}
