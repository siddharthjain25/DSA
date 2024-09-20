import java.util.Stack;

public class Leetcode232 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.pop());
    }
}

class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.add(item);
    }

    public int remove(int item) throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}
