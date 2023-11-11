// Johnathon Bulman

// LinkedList.java
// ===============
// Implementation of generic linked lists.

package linkedlists;

import java.io.*;

public class LinkedList<AnyType>
{
    // Don't jack up my node!
    private Node<AnyType> head, tail;

    public Node<AnyType> head()
    {
        return this.head;
    }

    public AnyType data()
    {
        return head.data();
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
        // First create the new node.
        Node<AnyType> newNode = new Node<>(data);

        // Insert it at the beginning of the list.
        newNode.next = head;
        head = newNode;

        // If the list was empty before adding this node, 'head' and 'tail'
        // need to reference this new node.
        if (tail == null)
            tail = newNode;

    }

    // Deletes at the front of the linked list.
    public AnyType delete_head()
    {
        // Check if list is empty.
        if (head == null)
            return null;
        
        // Store data and set head to head.next;
        AnyType temp = head.data();
        head = head.next;

        // If the new head is null, update the tail pointer.
        if (head == null)   
            tail = null;
        
        return temp;
    }

    public void print()
    {
        for (Node<AnyType> temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data() + ((temp.next == null) ? "\n" : " "));
    }

    public boolean isEmpty()
    {
        return (head == null);
    }
}

