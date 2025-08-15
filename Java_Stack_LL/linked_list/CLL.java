class CircularLL {
    private Node head;
    private Node tail;
    CircularLL(){
        this.head = null;
        this.tail = null;
    }
    void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }
    void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                if(node.next != null){
                    node = node.next;
                }
            }while(node != head);
        }
        System.out.println("HEAD");
    }
    void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
            return;
        }
        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);

    }
    private class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
        }
    }
}
class CLL{
    public static void main(String[] args) {
        CircularLL cl = new CircularLL();
        cl.insert(5);
        cl.insert(6);
        cl.insert(7);
        cl.insert(8);
        cl.insert(9);
        cl.insert(10);
        cl.insert(11);
        cl.display();
        cl.delete(5);
        cl.delete(6);
        cl.display();


    }
}
