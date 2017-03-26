package hw2;

/**
 * Created by kysft on 3/25/17.
 */
public class List {
    int[] a;
    int lastItem;
    public List(){
        a = new int[10];
        lastItem=-1;
    }
    public void insertItem(int newitem, int location){
        int i;

        if(lastItem+1==a.length){
            int[] b=new int[2*a.length];
            for(i=0;i<=lastItem;i++){
                b[i]=a[i];
            }
            a=b;
        }

        for(i=lastItem;i>=location;i--){
            a[i+1]=a[i];
        }
        a[location]=newitem;
        lastItem++;
    }
}
