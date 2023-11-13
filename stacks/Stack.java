// Johnathon Bulman

// Stack.java
// ==========
// Stack class that holds generics.

package stacks;

public abstract class Stack<AnyType>
{
    public abstract void push(AnyType data);

    public abstract AnyType pop();

    public abstract AnyType peek();

    public abstract boolean isFull();

    public abstract boolean isEmpty();

    public abstract void destroyStack();

    public abstract void print();
}
