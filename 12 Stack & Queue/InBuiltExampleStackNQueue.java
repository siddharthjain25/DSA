import java.util.*;

public class InBuiltExampleStackNQueue {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(35);
//        stack.push(36);
//        stack.push(37);
//        stack.push(38);
//        stack.push(39);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addLast(5);
        deque.removeFirst();
    }
}
