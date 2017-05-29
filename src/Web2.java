import java.net.URL;
import java.util.Scanner;


/**
 * Created by leca14 on 2017-02-10.
 */
public class Web2 {


    /**
     * Created by Fedi14 on 2017-02-10.
     */

        public static void main(String[] args) throws Exception {
            System.out.println("Skriv in önskade url: ");
            Scanner tgb = new Scanner(System.in);
            String url = tgb.nextLine();
            URL website = new URL("https://" +url);
            Scanner in = new Scanner(website.openStream());

            int tolength = 0;



            String rad;
            while (in.hasNext()) {
                rad = in.nextLine();
                tolength += rad.length();
            }

            System.out.println("Totala tecken i koden är " + tolength);
        }
    }

