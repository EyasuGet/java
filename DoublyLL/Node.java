package DoublyLL;

public class Node {
    int value;
    Node next;

    Node prev;

    public Node(int val,Node next){
        this.value = val;
        this.next = next;
    }

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    public Node (int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
