/* Author: JChase2
*  Just practicing data structures in java. 
*  Using a jar file generated from the linked 
* list application in this repo to build this stack. 
 */
package stack;

import linkedlist.*;

public class Stack <T>
{
    Linkedlist.Node head; // Current object at head. 
    
    public void push(Linkedlist aList, T item)
    {
        Linkedlist.Node aNode = new Linkedlist.Node(item);
        aList.addHead(item);
        head = aNode;
    }
    public String pop (Linkedlist aList)
    {
        String aReturn = head.getData().toString();
        aList.removeNode(head);
        return aReturn;
    }
    public String peek (Linkedlist aList)
    {
        String aReturn = head.getData().toString();
        return aReturn;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Linkedlist aList = new Linkedlist();
        Stack newStack = new Stack();
        if (newStack.isEmpty()) {
            System.out.println("It's empty!");
        } else
        {
            System.out.println("The stack has elements!");
        }
        newStack.push(aList, 1);
        System.out.println(newStack.pop(aList));
    }

}
