import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(getpermutate(n,k));

    }

    public static int getpermutate(int n,int r){
        int count = 0;
        String num = "";
        List<String> stringlist = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            num = num+i;
        }
        char[] numarray = num.toCharArray();
        getStringList(numarray,0,stringlist);
        for(int i=0;i<stringlist.size();i++){
            if(Validbars(stringlist.get(i),r)){
                count++;
            }
        }

        return count;
    }

    public static boolean Validbars(String mynumber,int r){
        int visible = 1;
        int currentmax = Integer.parseInt(String.valueOf(mynumber.charAt(0)));
        for(int i=0;i<mynumber.length();i++){
            int temp = Integer.parseInt(String.valueOf(mynumber.charAt(i)));
            if(temp > currentmax){
                visible++;
                currentmax = temp;
            }
        }
        return visible==r;

    }

    public static void getStringList(char[] num,int start,List<String> stringlist){
        if(start == num.length - 1){
            String finalstring = String.valueOf(num);
            stringlist.add(finalstring);
        }
        for(int i=start;i<num.length;i++){
            char[] duplicate = Arrays.copyOf(num,num.length);
            char temp = duplicate[start];
            duplicate[start] = duplicate[i];
            duplicate[i] = temp;
            getStringList(duplicate,start+1,stringlist);
        }
    }
}
