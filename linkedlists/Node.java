// Johnathon Bulman

// Node.java
// =========
// A node class whose 'data' field is designed to hold any type of data.

package linkedlists;

public class Node<T>
{
    private T data;
    Node<T> next;

    Node(T data)
    {
        this.data = data;
    }

    public T data()
    {
        return this.data;
    }

    public Node<T> next()
    {
        return this.next;
    }
}