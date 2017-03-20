/**
 * Created by kysft on 3/19/17.
 */

import java.lang.*;

public class Lecture4 {

    public void checkPass(int score){
        boolean pass= score>75;
        if(pass){
            System.out.println("You pass CS 61B");
        }else{
            System.out.println("You are such an unbelievable loser!");
        }
    }

    public void findMaxofThree(int x, int y, int z){
        if(x>y){
            if(x>z){
                System.out.println("Max is: " +x );
            }else{
                System.out.println("Max is: " +z);
            }
        }else{
            if(y<z){
                    System.out.println("Max is: " + z);
            }else{
                System.out.println("Max is: "+y);
            }
        }
    }
    public void switchShowMonth(int month){// could also use return
        int days=0;
        switch(month){
            case 2:
                days = 28;
                break;
            case 4:case 6:case 9:case 11:
                days=30;
                break;
            default:
                days=31;
                break;
        }
        System.out.println("The month " + month + " has " + days + " days!");
    }
    public int switchShowMonth2(int month) {// could also use return
        int days = 0;
        switch (month) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public void myMethord(int x){
        if(x==10){
            System.out.println("It's 10!");
        }
        return;
    }
    public static void main(String[] args) {
        //math class
        int y = -12;
        int x = Math.abs(y);
        //Integer class
        int z = Integer.parseInt("1984");
        //double class
        double d = Double.parseDouble("3.14");
        //float
        float f = Float.parseFloat("3f");

        int i=43;
        long l=43l;

        l=i;
        //i=l; compile ERROR
        i=(int)l;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);
        System.out.println(f);

        Lecture4 l4=new Lecture4();
        l4.checkPass(81);
        l4.checkPass(71);
        l4.findMaxofThree(2,45,12);
        l4.findMaxofThree(15,1,3);
        l4.findMaxofThree(34,56,89);
        l4.switchShowMonth(2);
        l4.switchShowMonth(7);
        l4.switchShowMonth(3);
        l4.switchShowMonth(9);
        l4.myMethord(11);
        l4.myMethord(10);
        System.out.println("The month 2 has " + l4.switchShowMonth2(2) +" days!");
        System.out.println("The month 7 has " + l4.switchShowMonth2(7) +" days!");
        System.out.println("The month 3 has " + l4.switchShowMonth2(3) +" days!");
        System.out.println("The month 9 has " + l4.switchShowMonth2(9) +" days!");

    }
}
