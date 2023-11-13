// Johnathon Bulman

// LinkedListStack.java
// ====================
// Linked list implementation of stacks.

package stacks;

import linkedlists.*;

public class LinkedListStack<SomeType> implements FancilyPrintable
{
    // Don't jack up the list, dude!
    private LinkedList<SomeType> list = new LinkedList<>();
    
    @Override
    // Push to the stack.
    public void push(SomeType data)
    {
        list.head_insert(data);
    }

    @Override
    // Pop from the stack. Returns popped data.
    public SomeType pop()
    {
        return list.delete_head();
    }

    @Override
    // Peeks at the top of the stack without popping.
    public SomeType peek()
    {
        return list.head().data();
    }

    @Override
    // Checks if stack is full. In this case, the stack is never full.
    public boolean isFull()
    {
        return false;
    }

    @Override
    // Checks if stack is empty.
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    @Override
    // Destroys the stack.
    public void destroyStack()
    {
        if (isEmpty())
            return;
        
        while (!isEmpty())
            pop();
    }

    @Override
    // Fancy prints the stack.
    public void print()
    {
        if (isEmpty())
            System.out.println("   (stack is empty)");
        
        Node<SomeType> temp = list.head();

        while (temp != null)
        {
            System.out.printf((temp == list.head()) ? " +------+\n" : "");
            System.out.printf(" | %-4s |%s\n", temp.toString(),
                                (temp == list.head()) ? "<-- top" : "");
            System.out.printf(" +------+\n");
            temp = temp.next();
        }
    }
}