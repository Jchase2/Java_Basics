/* Author: JChase2
*  Just practicing data structures in java. 
*  Using a jar file generated from the linked 
* list application in this repo to build this queue. 
 */
package queue;

import linkedlist.*;

public class Queue<T>
{

    public boolean isEmpty(Linkedlist aList)
    {
        return aList.returnHead() == null;
    }

    public void enqueue(Linkedlist aList, T item)
    {
        aList.addHead(item);
    }

    public String dequeue(Linkedlist aList)
    {
        if (aList.returnTail() != null)
        {
            String aReturn = aList.returnTail().getData().toString();
            aList.removeNode(aList.returnTail());
            return aReturn;
        } else
        {
            return "Already empty!";
        }
    }

    public String peek(Linkedlist aList)
    {
        if (aList.returnTail() != null)
        {
            String aReturn = aList.returnTail().getData().toString();
            return aReturn;
        } else
        {
            return "Already empty!";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Linkedlist aList = new Linkedlist();
        Queue newQueue = new Queue();
        if (newQueue.isEmpty(aList))
        {
            System.out.println("It's empty!");
        } else
        {
            System.out.println("The stack has elements!");
        }
        newQueue.enqueue(aList, 1);
        newQueue.enqueue(aList, 2);
        newQueue.enqueue(aList, "test");
        System.out.println(newQueue.dequeue(aList));
        System.out.println(newQueue.dequeue(aList));
        System.out.println(newQueue.dequeue(aList));
        System.out.println(newQueue.dequeue(aList));
        System.out.println(newQueue.peek(aList));
        newQueue.enqueue(aList, 1);
        System.out.println(newQueue.peek(aList));
    }

}
