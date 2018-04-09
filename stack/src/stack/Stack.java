/* Author: JChase2
*  Just practicing data structures in java. 
*  Using a jar file generated from the linked 
* list application in this repo to build this stack. 
 */
package stack;

import linkedlist.*;

public class Stack<T>
{

    public void push(Linkedlist aList, T item)
    {
        Linkedlist.Node aNode = new Linkedlist.Node(item);
        aList.addHead(item);
    }

    public String pop(Linkedlist aList)
    {
        if (aList.returnHead() != null)
        {
            String aReturn = aList.returnHead().getData().toString();
            aList.removeNode(aList.returnHead());
            return aReturn;
        }
        else
            return "Already Empty!";
    }

    public String peek(Linkedlist aList)
    {
        String aReturn = aList.returnHead().getData().toString();
        return aReturn;
    }

    public boolean isEmpty(Linkedlist aList)
    {
        return aList.returnHead() == null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Linkedlist aList = new Linkedlist();
        Stack newStack = new Stack();
        if (newStack.isEmpty(aList))
        {
            System.out.println("It's empty!");
        } else
        {
            System.out.println("The stack has elements!");
        }
        newStack.push(aList, 1);
        newStack.push(aList, 2);
        newStack.push(aList, 3);
        System.out.println(newStack.pop(aList));
        System.out.println(newStack.pop(aList));
        System.out.println(newStack.pop(aList));
        System.out.println(newStack.pop(aList));
    }

}
