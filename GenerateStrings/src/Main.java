import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        generateStrings(mylist,new ArrayList<>(),n,new Coordinates(0,0));
        System.out.print(mylist);

    }

    public static void generateStrings(ArrayList<String> mylist,ArrayList<String> thislist,int n,Coordinates mycoordinate){
        if(thislist.size() == 2*n){
            String finalString = finalString(thislist);
            mylist.add(finalString);
            return;
        }
        if(mycoordinate.CheckUpSide() && mycoordinate.CheckRightSide(n)){
                ArrayList<String> duplicate =  (ArrayList<String>) thislist.clone();
                thislist.add("(");
                generateStrings(mylist,thislist,n,new Coordinates(mycoordinate.getX()+1,mycoordinate.getY()));
                duplicate.add(")");
                generateStrings(mylist,duplicate,n,new Coordinates(mycoordinate.getX(),mycoordinate.getY()+1));
        }else if(!mycoordinate.CheckUpSide() && mycoordinate.CheckRightSide(n)){
               thislist.add("(");
               generateStrings(mylist,thislist,n,new Coordinates(mycoordinate.getX()+1,mycoordinate.getY()));
        }else if(mycoordinate.CheckUpSide() && !mycoordinate.CheckRightSide(n)){
            thislist.add(")");
            generateStrings(mylist,thislist,n,new Coordinates(mycoordinate.getX(),mycoordinate.getY()+1));
        }


    }

    public static String finalString(ArrayList<String> thislist){
        StringBuilder result = new StringBuilder();
        for(String str : thislist){
            result.append(str);
        }
        return result.toString();
    }

}