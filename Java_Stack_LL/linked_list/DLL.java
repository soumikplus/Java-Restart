class Doubly_LL{
    private class Node{
        int val;
        Node next;
        Node prev; // addition
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head;
    Node find(int val){
        Node node = head; // doubt
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;

    }

    void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) head.prev = node;
        head = node;
    }
    void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    void insert(int after, int value){
        Node p = find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null)
        node.next.prev = node;

    }
    void display(){
        Node node = head;
        Node last = null;
        while (node!=null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("NULL");

        System.out.println("print in reverse : ");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }
    
}

public class DLL {
    public static void main(String[] args) {
        Doubly_LL list = new Doubly_LL();
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(20);
        list.insertFirst(4);
        list.insertFirst(10);
        // list.display();
        list.insertLast(25);
        list.insert(99, 100);
        list.display();


    }
}
