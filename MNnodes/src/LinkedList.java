

public class LinkedList {
    private Node head;

    public Node getHead(){
        return this.head;
    }

    public void insertNode(int data){
        if(this.head == null){
            this.head = new Node(data);
            return;
        }
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        return;
    }


    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node newnext){
            this.next = newnext;
        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
