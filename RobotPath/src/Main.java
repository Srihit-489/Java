import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Character>> mylist = new ArrayList<List<Character>>();
        int sizeOfSquare = 3;
        List<Character> currentlist = new ArrayList<Character>();
        getPath(mylist,currentlist,sizeOfSquare,0,0);
        for(List<Character> temp : mylist){
            System.out.println(temp.toString());
        }
    }

    public static void getPath(List<List<Character>> mylist,List<Character> currentlist,int size,int x,int y){
        if(x == size && y == size){
            mylist.add(currentlist);
            return;
        }else if(x != size && y == size){
            currentlist.add('R');
            getPath(mylist,currentlist,size,x+1,y);
        }else if(x == size && y != size){
            currentlist.add('U');
            getPath(mylist,currentlist,size,x,y+1);
        }else{
            List<Character> newlist = new ArrayList<Character>(currentlist);
            currentlist.add('U');
            getPath(mylist,currentlist,size,x,y+1);
            newlist.add('R');
            getPath(mylist,newlist,size,x+1,y);
        }
    }

}
