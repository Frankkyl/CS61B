package hw1;

/**
 * Created by kysft on 3/22/17.
 */

import java.io.*;
import java.util.*;

public class Nuke2 {

    public static void main(String[] args) throws Exception{

        BufferedReader bfkeyboard = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String input=(bfkeyboard.readLine()).toString();
        str = input.substring(0,1)+input.substring(2,input.length());
        System.out.println();
        System.out.println("<-----solution by substring---->");
        System.out.println(str);
        System.out.println();
        System.out.println("<------solution by charAt------>");
        for(int i=0;i<input.length();i++){
            while(i!=1){
                System.out.print(input.charAt(i));
                break;
            }
        }
    }
}
