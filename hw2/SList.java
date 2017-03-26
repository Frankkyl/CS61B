package hw2;

import java.lang.*;
/**
 * Created by kysft on 3/25/17.
 */
public class SList {
    private SListNode head;
    private int size;

    public SList(){
        head=null;
        size=0;
    }

    public void insertFront(Object item){
        //head=new SListNode(item,head); ??
        size++;
    }
}
