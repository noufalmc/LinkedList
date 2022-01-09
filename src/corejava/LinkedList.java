package corejava;

public class LinkedList {
    Node head;
    Node tail;
    public Node push(int data)
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
        return newnode;
    }

    public void append(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void inBetween(Node prev,int data)
    {
        Node newNode=new Node(data);
        newNode.next=prev.next;
        prev.next=newNode;


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
    public void delHead()
    {

        head=head.next;
    }
}
