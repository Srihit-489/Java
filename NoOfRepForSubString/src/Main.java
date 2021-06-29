public class Main {
    public static void main(String[] args) {
        String source = "abcd";
        String substring = "cdabcdab";
        System.out.println("The answer is "+getSubStringCount(source,substring));
    }

    public static int getSubStringCount(String source,String substring){
        String finalString = source;
        int count = 1;
        while(!isSubStirng(finalString,substring)){
            count++;
            finalString = finalString + source;
        }
        return count;
    }

    public static boolean isSubStirng(String finalString,String substring){
        if(substring.length() > finalString.length()){
            return false;
        }
        for(int i=0;i<finalString.length();i++){
            for(int j=i+substring.length();j<finalString.length();j++){
                if(finalString.substring(i,j).equals(substring)){
                    return true;
                }
            }
        }
        return false;
    }
}
