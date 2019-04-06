package Array;

import java.util.ListIterator;

public class MySpecialLinkedList {
    private static LInkedListNode head =null;

    public void printL(LInkedListNode shead){
        LInkedListNode i=shead;
        while (i != null){
            System.out.print(i.value);
            i=i.next;
        }
        System.out.println();
    }

    public void add (int x,int index){
        LInkedListNode newnode =new LInkedListNode();
        newnode.value=x;
        if (index==0){
            newnode.next=head;
            head=newnode;
        }
        else{
            LInkedListNode i=head;
            for(int j=0;j<index-1;j++){
                i=i.next;
            }
            newnode.next=i.next;
            i.next=newnode;
        }
    }

    public  LInkedListNode gethead(){
        return head;
    }

    public void remove(int index){
        if(index==0){
            head=head.next;
        }else {
            LInkedListNode i = head;
            LInkedListNode j;
            for (int x = 0; x < index - 1; x++) {
                i = i.next;
            }
            j=i.next;
            i.next=j.next;

        }
    }

    public  double[] summary(){
        double [] arr =new double[5];
        int max,min;
        max=min=head.value;
        int lenght=0;
        arr[0]=0;
        LInkedListNode i=head;
        while (i != null){
            if(i.value>max)max=i.value;
            else if(i.value<min)min=i.value;
            arr[0]+=i.value;
            lenght++;
            i=i.next;
        }
        arr[1]=arr[0]/ lenght;
        if((lenght%2)!=0){
            i=head;
            for(int x=0;x<lenght/2;x++){
                i=i.next;
            }
            arr[2]=i.value;
        }else if (lenght%2==0){
            i=head;
            LInkedListNode j;
            for(int x=0;x<(lenght-1)/2;x++){
                i=i.next;
            }
            j=i.next;
            arr[2]=(i.value+j.value)/2.0;
        }
        arr[3]=max;
        arr[4]=min;
        return arr;
    }

    public static LInkedListNode reverse(LInkedListNode shead){
        if (shead==null||shead.next==null){return shead;}
        LInkedListNode reversed=shead,current=shead.next,temp;
        reversed.next=null;
        while(current!=null){
            temp=current.next;
            current.next=reversed;
            reversed=current;
            current=temp;
        }
        head=reversed;
        return reversed;
    }

    public  static LInkedListNode evenIndexedElements(LInkedListNode shead){
        LInkedListNode i=shead,j=i.next;
        while (j != null){
            i.next=j.next;
            i=j.next;
            j=i.next;
        }
        return shead;
    }

    public static LInkedListNode insertionSort(LInkedListNode shead){
        LInkedListNode i=shead,current=shead.next;
        while(current != null){
            i=shead;
            while (i.next != current){
                if(i.value>current.value){
                    int temp=current.value;
                    current.value=i.value;
                    i.value=temp;
                }else{
                    i=i.next;
                }
            }
            current=current.next;
        }
        return shead;
    }

    public static LInkedListNode removeCentralNode(LInkedListNode shead){
        LInkedListNode i=shead,j=shead;
        LInkedListNode k=i,m=k;
        while (j!=null &&j.next!=null){
            m=k;
            k=i;
            i=i.next;
            j=j.next.next;
        }
        if(j==null){
            m.next=k.next;
        }else {
            k.next=i.next;
        }
        return shead;
    }

    public static boolean palindrome(LInkedListNode shead){
        LInkedListNode i=shead;
        int length=0,j=0;
        while (i!=null){
        length++;
        i=i.next;
        }
        int [] arr =new  int[length];
        i=shead;
        for(int k=0;k<length;k++){
            arr[k]=i.value;
            i=i.next;
        }
        for (int k=0;k<length/2;k++){
            if(arr[k]!= arr[length-1-k]){
                return false;
            }
        }
        return true;
    }
}
