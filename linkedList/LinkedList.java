/* Author: JChase2
*  Just practicing data structures in java. 
*  Generic Linked List. 
*  Heavily commented for reference  and learning purposes...
 */

public class LinkedList<T>
{

    private Node<T> head; // Current object at head. 

    // Empty constructor for LinkedList
    public LinkedList()
    {
        head = null;
    }

    // Add node to front of list. 
    // E.g. create a new head. 
    public void addHead(T item)
    {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }
    
    public void removeHead ()
    {
        head = head.next;
    }
    
    public void printAll ()
    {
        Node tempNode = head;
        System.out.println(tempNode.getData());
        while (tempNode.next != null)
        {
            tempNode = tempNode.next;
            System.out.println(tempNode.getData());
        }
    }
    

    
    // Node class. 
    private class Node<T>
    {

        private T data; // Data in current node object. 
        private Node<T> next; // Points to next object after current node. 

        // Constructor. 
        public Node(T item)
        {
            this.data = item;
            this.next = null;
        }

        // Get data in current node. 
        public T getData()
        {
            return this.data;
        }

        public void setData(T item)
        {
            this.data = item;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LinkedList newList = new LinkedList();
        newList.addHead(5);
        newList.addHead("oh");
        newList.addHead("kk");
        newList.addHead("finished");
        newList.printAll();
        
    }
}
