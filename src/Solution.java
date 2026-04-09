import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the integer N
        int N = sc.nextInt();
        sc.nextLine();
        // TODO: Create a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();
        // TODO: Read N integers and add them to the LinkedList
        for(int i=0; i<N; i++) list.add(sc.nextInt());
        // TODO: Create a ListIterator for the LinkedList
        ListIterator<Integer> it = list.listIterator();
        // TODO: Traverse the list in the forward direction and print the elements
        System.out.print("Forward: ");
        for(int j=0; j<N; j++) {
          System.out.print(it.next());
          if(j!=N-1) System.out.print(" ");
        }
        // TODO: Traverse the list in the backward direction and print the elements
        System.out.print("\nBackward: ");
        for(int k = 0; k < N; k++) {
          System.out.print(it.previous());
          if(k!=N-1) System.out.print(" ");
        }
        sc.close();
    }
}

