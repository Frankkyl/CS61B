package hw3;

/**
 * Created by kysft on 4/2/17.
 */

//heap=>all objects, including arraya
//stack=>local variable including parameters.
    //a stack frame

/*
* Stack: Slist.main*/
class IntBox {
    static void doNothing(int x){
        x=2;
    }

    public int i;
    static void set3(IntBox ib){
         ib.i=3;
    }
    /*static void badset4(IntBox ib){
        ib=new IntBox(4);
        ib.4;
    }*/
}
/*Binary search
* sorted array, value "FindMe"*/
/*recursion base cases*/
/*how fast?n...n/2...n/4...n/8...
* log2^n
* Logarithems:G7T #4.1.2 & 4.1.7*/
/*scope & recurison*/
public class Bsearch{
    public static final int FAILURE=-1;
    private static int bsearch(int[]i, int left, int right, int findMe){
        if(left>right){//whittled size to "0"
            return FAILURE;
        }
        int mid=(left+right)/2; //round off, to be closed to the middle
        if(findMe==i[mid]){
            return mid;
        }else if(findMe<i[mid]){
            return bsearch(i,left,mid-1, findMe);
        }else{
            return bsearch(i,mid-1,right,findMe);
        }
    }
    /*public static int bsearch(int[]i, int findMe){
        bsearch(i,0,i.length-1,findMe);
    }*/
}
