// Johnathon Bulman

// LinkedListStack.java
// ====================
// Linked list implementation of stacks.

package stacks;

import linkedlists.*;

public class LinkedListStack<SomeType> extends Stack<SomeType> implements FancilyPrintable
{
    LinkedList<SomeType> l = new LinkedList<>();
    
    @Override
    public void push(SomeType data)
    {
        l.head_insert(data);
    }

    @Override
    public SomeType pop()
    {
        return l.delete_head();
    }

    @Override
    public SomeType peek()
    {
        return l.data();
    }

    @Override
    public boolean isFull()
    {
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return l.isEmpty();
    }

    public void destroyStack()
    {
        if (isEmpty())
            return;
        
        while (!isEmpty())
            pop();
    }

    @Override
    public void print()
    {
        fancyPrint();
    }

    @Override
    public void fancyPrint()
    {
        if (isEmpty())
            System.out.println("   (stack is empty)");
        
        Node<SomeType> temp = l.head();
        while (temp != null)
        {
            System.out.print(" |%-4s" + temp.data() + "|");
            if (temp == l.head())
                System.out.print(" <--top\n");
            else
                System.out.print("\n");

            System.out.printf(" +------+\n");
            temp = temp.next();
        }
    }
}