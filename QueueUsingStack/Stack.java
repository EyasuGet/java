package QueueUsingStack;

public class Stack {
    int[] st1 = new int[5];
    int[] st2 = new int[5];
    int top1 =0;
    int top2=0;
    int count=0;
    public void push1(int data){
        st1[top1] = data;
        top1++;
    }public void push2(int data){
        st2[top2] = data;
        top2++;
    }

    public void enqueue(int data){
        push1(data);
        count++;
    }
    public void dequeue(){
        if (top1 == 0 && top2==0)
        {
            System.out.println("queue is empty");
        }else
        {
            for (int i = 0; i < count; i++) {
                int a = pop1();
                push2(a);
            }

            int b = pop2();
            System.out.println("the dequeued element is " + b);
            count--;

            for (int i = 0; i < count; i++) {
                int a = pop2();
                push1(a);
            }

        }

    }
    public int pop1(){
        int data;
        top1--;
        data = st1[top1];
//        st1[top1] = 0;
        return data;
    }

    public int pop2(){
        int data;
        top2--;
        data = st2[top2];
//        st1[top2] = 0;
        return data;
    }


    public void display(){
        for (int i = 0; i < top1; i++) {
            System.out.print(st1[i] + " ");
        }
        System.out.println();

    }


}
