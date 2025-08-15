class CQueue{
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end = 0;
    int front = 0;
    int size = 0;
    CQueue(){
        this(DEFAULT_SIZE);
    }
    CQueue(int size){
        this.data = new int[size];
    }
    boolean isFull(){
        return size == data.length;
    }
    boolean isEmpty(){
        return size == 0;
    }
    boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    int fornt()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    void display(){
        int i = front;
        do{
            System.out.print (data[i] + " ");
            i++;
            i = i % data.length;
        }while(i!=end);
        System.out.println();
    }

}
class CircularQueue {
    public static void main(String[] args) throws Exception {
        CQueue queue = new CQueue();
        // System.out.println(queue.remove());
        // queue.remove();
        queue.insert(25);
        queue.insert(26);
        queue.insert(27);
        queue.insert(28);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(10);
        queue.display();
    }
}
