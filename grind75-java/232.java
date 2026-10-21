import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
    Deque<Integer> lifo = new ArrayDeque<>();
    Deque<Integer> fifo = new ArrayDeque<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        lifo.push(x);
        
    }
    
    public int pop() {
        move();
        return fifo.pop();
    }
    
    public int peek() {
        move();
        return fifo.peek();
    }
    
    public boolean empty() {
        
        return lifo.isEmpty() && fifo.isEmpty();
    }
    public void move(){
        if (fifo.isEmpty()) {
            while (!lifo.isEmpty()) {
                fifo.push(lifo.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */