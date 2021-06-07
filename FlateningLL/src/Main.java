public class Main {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.insertNodeHeadDown(1);
     //   mylist.printList();
        mylist.insertNodeHeadDown(4);
     //   mylist.printList();
        mylist.insertNodeHeadDown(7);
        mylist.newHeadNode(13);
        mylist.insertNodeDownOf(18,13);
        mylist.insertNodeDownOf(19,13);
        mylist.newHeadNode(22);
        mylist.insertNodeDownOf(25,22);
        mylist.insertNodeDownOf(27,22);
        mylist.insertNodeDownOf(28,22);
        mylist.printList();
    }
}
