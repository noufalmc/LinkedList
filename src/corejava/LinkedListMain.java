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
        System.out.println("Enter 2 to add the data at the end");
        System.out.println("Enter 3 add the item at inbetween");
        System.out.println("Enter 4 del the item at head");
        System.out.println("Enter 5 pop the item");
        switch(sc.nextInt())
        {
            case 1:
                op.addAtStart();
                break;
            case 2:
                op.appendList();
                break;
            case 3:
                op.inBetween();
                break;
            case 4:
                op.delHead();
                break;
                case 5:
                    op.popList();
                    break;
        }
    }
}
