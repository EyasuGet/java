package DoublyLL;

public class DoubleLL {

    private Node head;
    private Node tail;

    public DoubleLL()
    {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val)
    {
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;

        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
            }
    }
    public void insertAt(int index,int value){
        Node node = new Node(value);
        for (int i = 1; i < index; i++) {
        }



    }
    public void display(){
        Node temp = head;

        System.out.print("Forward: ");
        while(temp.next != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println(temp.value);


        System.out.println();
        System.out.print("Backward: ");

        while(temp.prev != null){
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println(temp.value);
    }
}

