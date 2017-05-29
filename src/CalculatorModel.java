import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by magnus on 2017-01-27.
 */
// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists
public class CalculatorModel {
    // Holds the value of the sum of the numbers
    // entered in the view
    private int calculationValue;

    public int getint() {
        return calculationValue;
    }


    public void countCharacters(String url) {
        URL website = null;
        try {
            website = new URL("https://" + url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Scanner in = null;
        try {
            in = new Scanner(website.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int tolength = 0;


        String rad;
        while (in.hasNext()) {
            rad = in.nextLine();
            tolength += rad.length();
        }
        calculationValue = tolength;
    }

    


}

    

