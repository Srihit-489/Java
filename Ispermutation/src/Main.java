import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str1 = "abca";
        String str2 = "caba";
        System.out.println("Is a permuatation : "+ispermuatation(str1,str2));
    }

    public static boolean ispermuatation(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        List<Character> myhashset = new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            myhashset.add(str1.charAt(i));
        }
        int count = 0;
        for(int i=0;i<str2.length();i++){
            char temp = str2.charAt(i);
            if(myhashset.contains(temp)){
                count++;
                int index = myhashset.indexOf(temp);
                myhashset.remove(index);
            }
        }
        return count == str1.length();
    }
}
