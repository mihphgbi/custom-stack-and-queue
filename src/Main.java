public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack sau khi pop: " + stack);

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue sau khi dequeue: " + queue);
    }
}
