// Johnathon Bulman

// TestCase02.java
// ===============
// Inserts a bunch of integers into the linked list and then deletes them all.
import linkedlists.*;

public class TestCase02
{
    public static void main(String [] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();

        // Insert some random data.
        for (int i = 0; i < 1000; i++)
            ll.head_insert((int)(Math.random() * 100) + 1);

        // Deletes random data.
        for (int i = 0; i < 1000; i++)
            ll.delete_head();

        if (ll.head() == null && ll.tail() == null)
            System.out.println("PASS!");
        
        else 
            System.out.println("Fail");
    }
}