/* Author: JChase2
*  Just practicing data structures in java. 
*  Generic Doubly Linked List. 
*  Heavily commented for reference  and learning purposes...
 */

public class LinkedList<T>
{

    private Node<T> head; // Current object at head. 
    private Node<T> tail; // Current object at tail. 

    // Empty constructor for LinkedList
    public LinkedList()
    {
        head = null;
    }
    
    public void insertBefore(T item, Node beforeNode)
    {
        Node newNode = new Node(item);
        newNode.next = beforeNode;
        if (beforeNode.previous == null)
        {
            newNode.previous = null;
            head = newNode;
        }
        else 
        {
            newNode.previous = beforeNode.previous;
            beforeNode.previous.next = newNode;
            beforeNode.previous = newNode;
        }
    }
    
    public void insertAfter(T item, Node afterNode)
    {
        Node newNode = new Node(item);
        newNode.previous = afterNode;
        if (afterNode.next == null)
        {
            newNode.next = null;
            tail = newNode;
        }
        else 
        {
            newNode.next = afterNode.next;
            afterNode.next.previous = newNode;
            afterNode.next = newNode;
        }
    }

    // Add node to front of list. 
    // E.g. create a new head. 
    public void addHead(T item)
    {
        Node newNode = new Node(item);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
            head.next = null;
            head.previous = null;
        }
        else 
            insertBefore(item, head);
    }
    
    public void removeNode(Node node)
    {
        if (node.previous == null)
        {
            head = node.next;
        }
        else
            node.previous.next = node.next;
        if (node.next == null)
        {
            tail = node.previous;
        }
        else
            node.next.previous = node.previous;
    }
    
    // Adds a Tail to the list. 
    public void addTail(T item)
    {
        Node newNode = new Node(item);
        newNode.previous = tail;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode; 
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
        private Node<T> previous; // Points to previous Node. 

        // Constructor. 
        public Node(T item)
        {
            this.data = item;
            this.next = null;
            this.previous = null;
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
        newList.addTail("end node test");
        newList.printAll();
        newList.removeNode(newList.head);
        newList.printAll();
        newList.removeNode(newList.tail);
        newList.printAll();
        
    }
}
