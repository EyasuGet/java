package QueueUsingStack;

public class Main {
    public static void main(String[] args) {
        Stack que = new Stack();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.display();
        que.dequeue();
        que.display();
        que.dequeue();
        que.display();

    }
}
