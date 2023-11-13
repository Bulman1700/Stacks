// Johnathon Bulman

// TestStack.java
// ===============
// Class that allows the user to build a stack of any type.

import java.util.Scanner;
import stacks.*;

public class TestStack
{
    // Main menu.
    public static void printMenu()
    {
        System.out.println();
        System.out.println("Stack ops:");
        System.out.println();
        System.out.println("  new       -- create a new stack");
        System.out.println("  destroy   -- completely destroy the current stack");
        System.out.println("  push <n>  -- push <n> onto the stack");
        System.out.println("  pop       -- pops the top element off the stack");
        System.out.println("  peek      -- prints the stack;s top element without removing it");
        System.out.println("  empty     -- indicates whether stack is empty");
        System.out.println("  full      -- indicates whether stack is full");
    }

    public static void main(String [] args)
    {
        printMenu();
        System.out.println();
        Scanner scn = new Scanner(System.in);
        Stack<String> s = null;
        
        // Keeps looping until user exits the main menu.
        while (true)
        {
            System.out.println("Enter a command ('?' for help, or 'exit' to quit.)");
            String str = scn.next();

            if (str.equals("?"))
            {
                printMenu();
            }
            else if (str.equals("new"))
            {
                if (s != null)
                    s.destroyStack();
                
                s = new LinkedListStack<>();
            }
            else if (str.equals("destroy"))
            {
                if (s != null)
                    s.destroyStack();
                
                s = null;
            }
            else if (str.equals("push"))
            {
                if (s == null)
                    s = new LinkedListStack<>();

                str = scn.next();
                s.push(str);
            }
            else if(str.equals("pop"))
            {
                if (s == null)
                    continue;

                if (!s.isEmpty())
                    System.out.println("\n  -> *popped* " + s.pop());
            }
            else if (str.equals("peek") || str.equals("top"))
            {
                if (s == null)
                    continue;

                if (!s.isEmpty())
                    System.out.println("\n  -> peek: " + s.peek());
            }
            else if (str.equals("empty"))
            {
                if (s == null)
                    continue;

                if (s.isEmpty())
                    System.out.println("\n  -> stack is empty");
                else
                    System.out.println("\n  -> stack is not empty");
            }
            else if (str.equals("full"))
            {
                if (s == null)
                    continue;
                    
                if (s.isFull())
                    System.out.println("\n  -> stack is full");
                else
                    System.out.println("\n  -> stack is not full");
            }
            else if (str.equals("exit"))
            {
                break;
            }

            // Print the stack after each command.
            if (s == null)
                System.out.println("   (no stack)");
            else
                s.print();
            
            System.out.println();
        }
    }
}