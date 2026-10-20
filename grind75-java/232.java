import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
    Deque<Integer> deque = new ArrayDeque<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        deque.add(x);
    }
    
    public int pop() {
        int num = deque.peek;
        deque.removeFirst();
        deque.
        return num;
    }
    
    public int peek() {
        return deque.getFirst();
    }
    
    public boolean empty() {
        if(deque.size()>0)return false;
        return true;
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