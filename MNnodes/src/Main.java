public class Main {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.insertNode(1);
        mylist.insertNode(2);
        mylist.insertNode(3);
        mylist.insertNode(4);
        mylist.insertNode(5);
        mylist.insertNode(6);
        mylist.insertNode(7);
        mylist.insertNode(8);
        mylist.printList();
        deleteAlter(mylist.getHead(),2,2);
        mylist.printList();
    }
    public static void deleteAlter(LinkedList.Node head,int m,int n){
        if(head == null){
            return;
        }
        int num = n;
        int pos = m;
        LinkedList.Node temp = head;
        while(pos != 1){
            if(temp == null){
                return;
            }
            temp = temp.getNext();
            pos = pos-1;
        }
        while(num != 0){
            if(temp.getNext() == null){
                return;
            }
            temp.setNext(temp.getNext().getNext());
            num = num-1;
        }
        deleteAlter(temp.getNext(),m,n);
    }

}
