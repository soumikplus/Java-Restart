class StackDs{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    StackDs(){
        this(DEFAULT_SIZE);
    }
    StackDs(int size){
        this.data = new int[size];
    }
    boolean isFull(){
        return ptr == data.length-1;
    }
    boolean isEmpty(){
        return ptr == -1;
    }
    boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }
    int pop(){
        if(isEmpty()){
            System.out.println("pop not possible");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        // return data[ptr--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Cant peek from an empty stack");
        }
        return data[ptr];
    }
}
class DynamicStack extends StackDs{
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);        // it will automatically call StackDs(int size)
    }
    boolean push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for(int i = 0;i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }

}
class Stack {
public static void main(String[] args) {
    StackDs stack = new StackDs();
    // stack.pop();
    stack.push(25);
    stack.push(26);
    stack.push(27);
    stack.push(28);
    stack.push(29);
    
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    DynamicStack ds = new DynamicStack(2);
    ds.push(25);
    ds.push(26);
    ds.push(27);
    System.out.println(ds.pop());
    System.out.println(ds.pop());
    System.out.println(ds.pop());

}    
}
