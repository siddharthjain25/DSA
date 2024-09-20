import java.util.Stack;

public class QueueUsingStackRemoveEfficient {
    private final Stack<Integer> first;
    private final Stack<Integer> second;

    public QueueUsingStackRemoveEfficient(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int remove(int item) throws Exception{
        return first.pop();
    }

    public int peek() throws Exception{
        return first.peek();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}
