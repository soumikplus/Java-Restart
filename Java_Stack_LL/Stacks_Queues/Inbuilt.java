import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class Inbuilt {
    public static void main(String args[]){
        Stack<Integer>stack = new Stack<>();
        stack.push(65);
        stack.push(69);
        stack.push(36);
        stack.push(98);
        stack.push(30);
        stack.push(12);
        // System.out.println(stack.pop());
        
        Queue<Integer>queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue);
        Deque<Integer>dq = new ArrayDeque<Integer>();
        dq.add(54);
        dq.add(55);
        dq.add(56);
        dq.add(57);
        dq.addFirst(0);
        System.out.println(dq);


    }
}
