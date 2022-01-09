package corejava;

import java.security.PublicKey;

public class Operations {
    LinkedList LL=new LinkedList();
    public void addAtStart()
    {
       LL.push(70);
       LL.push(30);
       LL.push(56);
       LL.print();
    }
   public void appendList()
   {
       LL.append(56);
       LL.append(30);
       LL.append(70);
       LL.print();
   }
   public void inBetween()
   {
       Node firstNode=LL.push(56);
       Node secondNode=LL.push(70);
       System.out.println("before");
       LL.print();
       LL.inBetween(secondNode,30);
       System.out.println("After");
       LL.print();
   }
   public void delHead()
   {
       LL.push(70);
       LL.push(30);
       LL.push(56);
       System.out.println("before");
       LL.print();
       LL.delHead();
       System.out.println("After");
       LL.print();
   }
   public void popList()
   {
       LL.push(56);
       LL.push(30);
       LL.push(70);
       System.out.println("before");
       LL.print();
       LL.delHead();
       System.out.println("After");
       LL.print();
   }
   public void search()
   {
       LL.push(56);
       LL.push(30);
       LL.push(70);
       LL.search(30);
   }
   public void searchInsert()
    {
        LL.push(56);
        LL.push(30);
        LL.push(70);
        LL.print();
        LL.searchInsert(30);
        LL.print();
    }
    public void  searchDelete()
    {
        LL.push(56);
        LL.push(30);
        LL.push(40);
        LL.push(70);
        System.out.println("before");
        LL.print();
        System.out.println("Size is ="+LL.size());
        LL.searchDelete(40);
        System.out.println("after");
        LL.print();
        System.out.println("Size is ="+LL.size());

    }




}
