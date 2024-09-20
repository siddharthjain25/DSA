public class StackMain {
    public static void main(String[] args) throws Exception {
        //CustomStack stack = new CustomStack(5);
        CustomStack stack = new DynamicStack(5);
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        stack.push(39);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
