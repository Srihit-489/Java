

class Main {
    public static void main(String[] args) {
        Linkedlist mylist = new Linkedlist();
        mylist.insertHead(9);
        mylist.insertHead(8);
        mylist.insertHead(7);
        mylist.insertHead(6);
        mylist.insertHead(5);
        mylist.printList();
       // System.out.println();
        Linkedlist reversed = new Linkedlist();
       // printReverse(mylist.getHead());
        mylist.reverseList();
        mylist.printList();
    }
    public static void printReverse(Linkedlist.Node node){
        if(node == null){
            return;
        }
        printReverse(node.next);
        System.out.print(node.data + " ");
    }



}

class Linkedlist{
    Node head;
    public Linkedlist(){
        this.head = null;
    }
    public Node getHead(){
        return this.head;
    }
    public void reverseList(){
        Node current = head;
        Node Next = null;
        Node prev = null;
        while(current!= null){
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        head = prev;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertHead(int data){
        Node newnode = new Node(data);
        if(head == null){
            this.head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        return;
    }
    public void insertHead(Node newnode){
        if(head == null){
            this.head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        return;
    }
    public void deleteHead(){
        head = head.next;
    }

    public Node searchNode(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return temp;
            }
        }
        return null;
    }

    public void insertAfter(Node nearNode,int data){
        Node newnode = new Node(data);
        newnode.next = nearNode.next;
        nearNode.next = newnode;
    }


    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
