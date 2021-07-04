import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String palistring = "tactklcoao";
        for(int i=0;i<palistring.length();i++){
            if(palistring.charAt(i) == ' '){
                palistring = palistring.substring(0,i) + palistring.substring(i+1);
            }
        }
        System.out.println("Is permutation of a palindrome : "+ispalin(palistring));
    }

    public static boolean ispalin(String mystring){
        List<Character> mylist = new ArrayList<>();
        for(int i=0;i<mystring.length();i++){
            mylist.add(mystring.charAt(i));
        }
        int odd=0;
        for(Character ch : mylist){
            if(Collections.frequency(mylist,ch)%2 == 1){
                odd++;
            }
        }
        return odd <= 1;
    }
}
