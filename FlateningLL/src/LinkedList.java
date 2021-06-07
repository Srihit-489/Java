public class LinkedList {
    Node head;

    public void insertNodeHeadDown(int data){
        if(head == null){
            this.head = new Node(data);
            return;
        }else{
            Node temp = head;
            while(temp.down != null){
                temp = temp.down;
            }
            temp.down = new Node(data);
            return;
        }
    }

    public void newHeadNode(int data){
        if(head == null){
            head = new Node(data);
            return;
        }else{
            Node temp = head;
            while(temp.right != null){
                temp = temp.right;
            }
            temp.right = new Node(data);
            return;
        }
    }

    public void printList(){
        Node runner1 = head;
        while(runner1 != null){
            Node runner2 = runner1;
            while(runner2 != null){
                System.out.print(runner2.data+" ");
                runner2 = runner2.down;
            }
            runner1 = runner1.right;
        }
    }

    public void insertNodeDownOf(int data,int par){
        Node temp = head;
        while(temp != null && temp.data != par){
            temp = temp.right;
        }
        if(temp == null){
            return;
        }
        while(temp.down != null){
            temp = temp.down;
        }
        temp.down = new Node(data);
        return;
    }

    class Node{
        int data;
        Node down;
        Node right;
        public Node(int data){
            this.data = data;
            this.down = null;
            this.right = null;
        }

    }
}
