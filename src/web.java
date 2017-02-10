/**
 * Created by leca14 on 2017-02-03.
 */

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class web {
    public static void main(String[] args) throws Exception {
        String url;
        Scanner in = new Scanner(System.in);
        url = in.nextLine();
        URL read = new URL(url);
        BufferedReader link = new BufferedReader(
                new InputStreamReader(read.openStream()));


        String inputLine;
        while ((inputLine = link.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }

}
