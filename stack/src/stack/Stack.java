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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Linkedlist aList = new Linkedlist();
        Stack newStack = new Stack();
        newStack.push(aList, 1);
        System.out.println(newStack.pop(aList));
    }

}
