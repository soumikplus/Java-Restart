class CustomQueue{
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end = 0;
    CustomQueue(){
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        this.data = new int[size];
    }
    boolean isFull(){
        return end == data.length;
    }
    boolean isEmpty(){
        return end == 0;
    }
    boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        for(int  i = 1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    int fornt()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    void display(){
        for(int i = 0;i<end;i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }

}
class Queue {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        System.out.println(queue.remove());
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
