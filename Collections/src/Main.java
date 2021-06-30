import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(2);
        mylist.add(4);
        mylist.add(1);
        mylist.add(3);
        List<Integer> newlist = new ArrayList<Integer>(mylist);
        //Collections.copy(newlist,mylist);
        System.out.println(newlist);
        Collections.sort(newlist);
        System.out.println(newlist);
        System.out.println(Collections.binarySearch(newlist,2));
        System.out.println(Collections.binarySearch(newlist,7));
        System.out.println(Collections.max(newlist));
        System.out.println(Collections.min(newlist));
        System.out.println(Collections.disjoint(mylist,newlist));
        System.out.println(Collections.emptyList());
        System.out.println(Collections.frequency(mylist,2));
        char[] chararry = new char[]{'a','b','c','d'};
        String finalstring = new String(chararry);
        System.out.println(finalstring.substring(1,2));
        int[] myarray = new int[]{1,3,4,5};
        



    }
}
