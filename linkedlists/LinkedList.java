// Johnathon Bulman

// LinkedList.java
// ===============
// Implementation of generic linked lists.

package linkedlists;

public class LinkedList<AnyType>
{
    // Don't jack up my node!
    private Node<AnyType> head, tail;

    public Node<AnyType> head()
    {
        return this.head;
    }

    public Node<AnyType> tail()
    {
        return this.tail;
    }

    // Insert at the tail of the linked list.
    public void tail_insert(AnyType data)
    {
        if (head == null)
        {
            head = tail = new Node<>(data);
        }
        else
        {
            tail.next = new Node<>(data);
            tail = tail.next;
        }
    }

    // Insert at the head of the linked list.
    public void head_insert(AnyType data)
    {
        // Create the node.
        Node<AnyType> newNode = new Node<>(data);

        // Insert at the beginning of the list.
        newNode.next = head;
        head = newNode;

        // If the list was empty beforehand, update the tail reference.
        if (tail == null)
            tail = newNode;
    }

    // Deletes at the head of the linked list.
    public AnyType delete_head()
    {
        // Check if list is empty.
        if (head == null)
            return null;
        
        // Store data about to be deleted.
        AnyType retval = head.data();
        // Update the head reference.
        head = head.next;

        // If the new head is null, update the tail reference.
        if (head == null)   
            tail = null;
        
        return retval;
    }

    // Print the linked list.
    public void print()
    {
        for (Node<AnyType> temp = head; temp != null; temp = temp.next)
            System.out.print(temp.toString() + ((temp.next == null) ? "\n" : " "));
    }

    // Checks if the list is empty.
    public boolean isEmpty()
    {
        return (head == null);
    }
}

