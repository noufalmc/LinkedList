/**
 * @author Noufal Mc
 * @created on 06-01-2022
 * Linked list operations
 */

package corejava;
import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Operations op=new Operations();
        System.out.println("Welcome to Linked List");
        System.out.println("Enter 1 to add the data at the start");
        switch(sc.nextInt())
        {
            case 1:
                op.addAtStart();
                break;

        }
    }
}
