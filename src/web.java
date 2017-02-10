/**
 * Created by leca14 on 2017-02-03.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class web {
    public static void main(String[] args) throws Exception {
        // ändrar lite
        String url;
        String source;
        Scanner in = new Scanner(System.in);
        url = in.nextLine();
        URL read = new URL("http://"+url);
        source = new String("http://" + url);
        BufferedReader link = new BufferedReader(
                new InputStreamReader(read.openStream()));


        String inputLine;
        while ((inputLine = link.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }

}
