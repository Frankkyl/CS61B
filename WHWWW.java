/**
 * Created by kysft on 3/19/17.
 */

import java.io.*;
import java.net.*;

public class WHWWW {
    public static void main(String[] args) throws Exception{
        URL u=new URL("http://www.whitehouse.gov/");
        InputStream ins=u.openStream();
        InputStreamReader isr=new InputStreamReader(ins);
        BufferedReader whiteHouse=new BufferedReader(isr);
        System.out.println(whiteHouse.readLine());
    }
}
