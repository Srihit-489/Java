import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Laptop> mylist = new ArrayList<>();
        mylist.add(new Laptop(8,"Hp pavilion",64000));
        mylist.add(new Laptop(16,"Legion",95000));
        mylist.add(new Laptop(12,"MSI",72000));
        mylist.add(new Laptop(4,"Acer",28000));
        mylist.add(new Laptop(8,"Dell",42000));
        printArrayList(mylist);
        Collections.sort(mylist,new comp());
        System.out.println("--------------------------------------------------------------");
        printArrayList(mylist);

    }

    public static void printArrayList(ArrayList<Laptop> mylist){
      for(int i=0;i<mylist.size();i++){
          System.out.println(mylist.get(i).toString());
      }
    }
}
