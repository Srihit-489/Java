import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputstring = "aaaaaabbbccdddddd";
        int end,start = 0;
        List<Character> myhashset = new ArrayList<>();
        String finalstring = "";
        myhashset.add(inputstring.charAt(0));
        for(end=1;end<inputstring.length();end++){
            char temp = inputstring.charAt(end);
            if(myhashset.contains(temp)){
                continue;
            }else{
                finalstring = finalstring+""+myhashset.get(0)+(end-start);
                start  = end;
                myhashset.clear();
                myhashset.add(temp);
            }
        }

        finalstring = finalstring+""+myhashset.get(0)+(end-start);

        System.out.println("the compressed string is : "+finalstring);
    }
}
