/**
 * Created by kysft on 3/19/17.
 */

import java.io.*;
public class Lecture2 {

    //String s1;


    public static void main(String[] args) {

        String s1 = "Yow!";
        //String s2 = new String(s1);
        String s2=s1.toUpperCase();
        String s3=s2.concat("!!!");
        String s4="*".concat(s2).concat("*");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //System.out output to the screen;
        //System.in read from keyboard;

        //readLine BufferedReader object;
        //how do we constract a BufferedReader: With an Input Stream Reader; chars into entirelines of text
        //InputStreamReader:InputStream; take raw data to compose into characters, which typically is "long", and editabel
        //InputStream:System.in; to read raw data from keyboard
        //figure this out from online java libraries API


    }

}
