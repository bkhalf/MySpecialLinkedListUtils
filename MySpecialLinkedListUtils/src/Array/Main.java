package Array;


public class Main {

    public static void main(String[] args) {

        MySpecialLinkedList l=new MySpecialLinkedList();
        l.add(1,0);
        l.add(2,1);
        l.add(3,2);
        l.add(2,3);
        l.add(1,4);
        LInkedListNode head =l.gethead();
        l.printL(head);
        double [] ar=new double[5];
        ar=l.summary();
        System.out.println(ar[0]+" "+ar[1]+" "+ar[2]+" "+ar[3]+" "+ar[4]);
        l.printL(head);
      //  head=MySpecialLinkedList.reverse(head);
       // l.printL(head);
      //  MySpecialLinkedList.evenIndexedElements(head);
      //  l.printL(head);
      //  MySpecialLinkedList.insertionSort(head);
      //  l.printL(head);
      //  MySpecialLinkedList.removeCentralNode(head);
       // l.printL(head);
        if(MySpecialLinkedList.palindrome(head)) System.out.println("yyyyy");
        else{
            System.out.println("nnnn");
        }
    }
}
