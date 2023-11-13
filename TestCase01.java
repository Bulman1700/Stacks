// Johnathon Bulman

// TestCase01.java
// =================
// Tests head and tail insertion of a linked list.

import linkedlists.*;

public class TestCase01
{
    // Takes in the list and an array representing the correct order of the linked list.
    private static boolean referenceCheck(LinkedList<Integer> ll, int [] values)
    {
        Node<Integer> temp = ll.head();

        for (int i = 0; i < values.length; i++)
        {
            if (temp.data().compareTo(values[i]) != 0)
                return false;
            temp = temp.next();
        }

        if (temp == null)
            return true;

        return false;
    }

    public static void main(String [] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();

        // Insert some data.
        ll.head_insert(5);
        ll.head_insert(6);
        ll.head_insert(-1);
        ll.tail_insert(35);
        ll.tail_insert(3);

        boolean success = true;

        // Check that data was inserted correctly.
        success &= referenceCheck(ll, new int [] {-1, 6, 5, 35, 3});
        
        // Return result.
        System.out.println(success ? "PASS!" : "fail");        
    }
}