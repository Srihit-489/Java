public class Main {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.insertNode(1);
        mylist.insertNode(2);
        mylist.insertNode(4);
        mylist.insertNode(8);
        mylist.printList();
        LinkedList mylist2 = new LinkedList();
        mylist2.insertNode(2);
        mylist2.insertNode(4);
        mylist2.insertNode(6);
        mylist2.printList();
        LinkedList intersection =  intersect(mylist,mylist2);
        System.out.println("The intersection is : ");
        intersection.printList();
        System.out.println("the union is : ");
        LinkedList union = union(mylist,mylist2);
        union.printList();

    }
    public static LinkedList intersect(LinkedList mylist,LinkedList mylist2){
        LinkedList result = new LinkedList();
        if(mylist == null){
            return null;
        }
        if(mylist2 == null){
            return null;
        }
        LinkedList.Node itr1 = mylist.getHead();
        while(itr1 != null){
            LinkedList.Node itr2 = mylist2.getHead();
            while(itr2 != null){
                if(itr1.data == itr2.data){
                    result.insertNode(itr2.data);
                }
                itr2 = itr2.next;
            }
            itr1 = itr1.next;
        }
        return result;
    }

    public static LinkedList union(LinkedList mylist,LinkedList mylist2){
        LinkedList result = new LinkedList();
        LinkedList.Node runner = mylist.getHead();
        while(runner != null ){
            result.insertNode(runner.data);
            runner = runner.next;
        }
        LinkedList.Node runner2 = mylist2.getHead();
        while(runner2 != null ){
            if(!result.search(runner2.data)){
                result.insertNode(runner2.data);
            }
            runner2 = runner2.next;
        }
        return result;
    }
}
