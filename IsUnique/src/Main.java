import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String mystring = "abcdeg";
        System.out.println("does the string have unique chars : "+isUnique(mystring));
    }

    public static boolean isUnique(String mystring){
        HashSet<Character> myhashset = new HashSet<Character>();
        int end;
        for(end = 0;end<mystring.length();end++){
            char temp = mystring.charAt(end);
            if(myhashset.contains(temp)){
                return false;
            }
            myhashset.add(temp);
        }
        return true;
    }
}
