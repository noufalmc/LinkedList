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
    public void popList()
    {
        Node temp;
        temp=head;
        Node temp1=head;
        while (temp!=null)
        {

            if(temp.next==null)
            {
                temp1.next=null;
            }
            temp1=temp;
            temp=temp.next;
        }
    }
    public void search(int data)
    {
        Node temp=head;
        int found=0;
        while (temp!=null)
        {
            if(temp.data==data)
            {
                found=1;
                System.out.println("Item Found");
                break;
            }
            temp=temp.next;
        }
        if(found==0)
        {
            System.out.println("Item Not Found");
        }
    }
    public void searchInsert(int data)
    {
        Node temp=head;
        Node temp1=head;
        int found=0;
        while (temp!=null)
        {
            if(temp.data==data)
            {
                found=1;
                Node newNode=new Node(40);
                newNode.next=temp;
                temp1.next=newNode;

            }
            temp1=temp;
            temp=temp.next;
        }
        if(found==0)
        {
            System.out.println("Item Not Found");
        }
    }
}
