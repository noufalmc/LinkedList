package corejava;

public class LinkedList {
    Node head;
    Node tail;
    public void push(int data)
    {
      Node newnode=new Node(data);
      if(head==null)
      {
          head=newnode;
          tail=newnode;
      }
      else
      {
         Node temp=head;
         this.head=newnode;
         newnode.next=temp;

      }
    }
    public void print()
    {

        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.println("--->"+temp.data);
                temp=temp.next;
            }
        }
    }
}
