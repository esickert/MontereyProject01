package stackQueue;


import java.util.Stack;

public class Queue {

    Queue() {
    }

    Queue(int x)    {
        int y = x;
    }

    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    public boolean isEmpty()    {
        return ((stk1.empty())&&(stk2.empty()));
    } //end of method isEmpty

    public int size()   {
        return stk1.size() + stk2.size();
    }

    public int enqueue(int i)  {
        return stk1.push(i);
    }

    public int dequeue() {
        if (stk2.empty())
            while (!stk1.empty())   {
                stk2.push(stk1.pop());
            }
        return  stk2.pop();
    }

    public int front()  {
        if (stk2.empty())
            while (!stk1.empty())   {
                stk2.push(stk1.pop());
            }
        return  stk2.peek();

    }
}
