package hw2;

/**
 * Created by kysft on 3/25/17.
 */
public class SListNode {
    public Object item;
    public SListNode next;
}
/*
* 2 problem with SListNodes
* 1. insert new item of beginning of list
*  x =new SListNode("soap", x);
* 2. how do you represent an empty list?
* x=null; ==> run-time error if u call a method on a nulll object;
* x.nth(1);*/

/*Solution:separate SList class maintains head of list*/