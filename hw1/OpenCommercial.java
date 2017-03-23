/**
 * Created by kysft on 3/22/17.
 */
/* OpenCommercial.java */

import java.net.*;
import java.io.*;
import java.util.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

    /** Prompts the user for the name X of a company (a single string), opens
     *  the Web site corresponding to www.X.com, and prints the first five lines
     *  of the Web page in reverse order.
     *  @param arg is not used.
     *  @exception Exception thrown if there are any problems parsing the
     *             user's input or opening the connection.
     */
    public static void main(String[] arg) throws Exception {

        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */

        String u="http://www."+inputLine+".com";//"http://" is must, only "www" would not help, and show no protocol error
        URL url=new URL(u);
        //read the web address
        InputStream isu=url.openStream();
        InputStreamReader isr= new InputStreamReader(isu);
        BufferedReader bf=new BufferedReader(isr);

        String currentline="";
        String[] str= new String[5];
        ArrayList al = new ArrayList();
        HashMap hm=new HashMap();
        System.out.println();
        System.out.println("<----normal order--->");
        for(int i=0;i<5;i++){
           currentline= bf.readLine();//each time u run bf.readLine(), it read the line, so you need save the data first
           System.out.println(currentline);
           str[i]=currentline;
           al.add(currentline);
           hm.put(i,currentline);
        }
        System.out.println();
        System.out.println("<----reverse order by HashMap--->");

        for(int i=4;i>=0;i--){
            System.out.println(hm.get(i));
        }
        System.out.println();
        System.out.println("<----reverse order by Array--->");
        for(int i=4;i>=0;i--){
            System.out.println(str[i]);
        }
        System.out.println();
        System.out.println("<----reverse order by ArrayList--->");
        for(int i=4;i>=0;i--){
            System.out.println(al.get(i));
        }

    }
}
