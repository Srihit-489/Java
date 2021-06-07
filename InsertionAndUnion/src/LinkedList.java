public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void insertNode(int data){
        Node newnode = new Node(data);
        if(this.head == null){
            head = newnode;
            return;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
            return;
        }
    }

    public boolean search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
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
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
