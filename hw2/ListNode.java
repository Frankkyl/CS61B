package hw2;

/**
 * Created by kysft on 3/23/17.
 */
public class ListNode {
    int item;
    ListNode next;

    public ListNode(){};

    public ListNode(int item, ListNode next){
       this.item=item;
       this.next=next;
    }
    public ListNode(int item){
        this(item,null);
    }
    /*Insert a new item after "this":*/
    public void insertAfter(int item){
        this.next=new ListNode(item, next);//the first next is new value, the second is old value
    }
    //l2.insertAfter(3);
    /*
    * for(...){
    *   l2.insertAfter(i);
    *   l2=l2.next;
    * }
    * */
/*advantages over array list:
* inserting item int middle of linledlist takes
* constant time if u have reference previours nodes
* more over, list can keep going until memory runs out.*/
/*disadvantages:
*finding the nth item of a linked list takes time proportional to n.(length of list)
* (constant time on array lists)
* */
    public ListNode nth(int position){
        if(position ==1){
            return this;
        }else if((position<1)||(next==null)){
            return null;
        }else{
            return next.nth(position-1);
        }
    }

    public static void main() {

    ListNode l1 = new ListNode(7,new ListNode(0,new ListNode(6))),
             l2 = new ListNode(),
             l3 = new ListNode();

    l1.item=7;
    l2.item=0;
    l3.item=6;

    l1.next=l2;
    l2.next=l3;
    l3.next=null;


    }
}


