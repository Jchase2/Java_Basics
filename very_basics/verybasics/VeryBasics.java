package verybasics;

public class VeryBasics
{

    public static void main(String[] args)
    {
        // while loop
        int a = 0;
        while (a < 20)
        {
            a++;
        }
        System.out.println("While loop output: " + a);

        // do while
        int counter = 0;
        do
        {
            counter++;
        } while (counter < a);
        System.out.println("Counter is at " + counter);

        // for loop (known # of iterations)
        a = 3;
        for (int x = 0; x < a; x++)
        {
            System.out.println("For loop output: " + x);
        }

        // if else
        if (a == 3)
        {
            System.out.println("A is at 3");
        } else
        {
            System.out.println("A is not at 3.");
        }
        // conditional operator 
        int b = 4;
        int x = (a > b) ? a : b;
        System.out.println("Conditional operator output: " + x);

        // arrays and array operations 
        // basic int array and accessing
        int [] anArray = new int[20];
        for (int v = 0; v < 20; v++)
        {
            anArray[v] = v;
        }
        System.out.println("Array at index 5: " + anArray[5]);

        // copying arrays (primitives)
        int[] arrCopy = new int [20];
        for (int q = 0; q < 20; q++)
        {
            arrCopy[q] = anArray[q];
        }

        // alternative copy using System
        int[] arrCopyTwo = new int [20];
        System.arraycopy(anArray, 0, arrCopyTwo, 0, 20);
        
        System.out.println("arrCopy output at zero: " + arrCopy[0]);
        System.out.println("arrCopyTwo output at zero: " + arrCopyTwo[0]);
        System.out.println("anArray output at zero: " + anArray[0]);
    }
}