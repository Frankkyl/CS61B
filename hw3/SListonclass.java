package hw3;


/**
 * Created by kysft on 4/2/17.
 */

public class SList {
    private SListNode head;
    private int size;
    public boolean equals(SList other){
        if(size!=other.size){
            return false;
        }
        SListNode n1=head;
        SListNode n2=head;
        while(n1!=null){
            if(!n1.item.equals(n2.item)){
                return false;
            }
            n1=n1.next;
            n2=n2.next;
        }
        return true;
    }
}

class SListNode{
    public Object item;
    public SListNode next;
}
