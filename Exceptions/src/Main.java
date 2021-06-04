import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> newlinkedlist = new LinkedList<Integer>();
        int n = 10;
        while(n != 0){
            newlinkedlist.addLast(n);
        }
        print(newlinkedlist,newlinkedlist.size());


    }
    public static void print(LinkedList<Integer> mylist,int num){
        if(num != 0){
            print(mylist,num-1);
            System.out.println(mylist.get(num));
        }
    }

}
