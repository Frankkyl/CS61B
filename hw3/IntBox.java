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
