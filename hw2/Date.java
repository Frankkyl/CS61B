package hw2;

/**
 * Created by kysft on 3/25/17.
 */
public class Date {
    private int day;
    private int month;

    private void setMonth(int m) {
        month = m;
    }

    public Date(int month, int day) {
        //implementation with error-checking code here.
    }
/*Interface:prototypes
* ADT */

/*another advantage of SList class*/

    /*DOUBLY-LINKED LISTS
    * inserting/deleting at front of list is easy*/
    class DListNode {
        Object item;
        DListNode next;
        DListNode prev;
    }

    class DList {
        private DListNode head;
        private DListNode tail;
    }

    //insert & delete items at both eds in constant running time.
// remove the tail node, at least 2 items in DList;
    //tail.prev.next=nul;
    //tail=tail.prev;
//sentinel: a special node that dose not represent an item.
//Dlist v2:circularly linked.
    class DList2 {
        private DListNode head;
        private int size;
    }
//DList invariants with sentinel
    //for DList d, d.head !=null
    //DListNode x, x.next !=null
    //..........x, x.prev !=null
    //..........x, if x.next ==y, then y.prev ==x
    //A DList's size is # of DListNodes, not counting sentinel
    //Empty DList:sentinal prev & next point to himself
}
