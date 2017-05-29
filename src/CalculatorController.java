/**
 * Created by magnus on 2017-01-27.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model
public class CalculatorController {



    public static void main(String[] args) throws Exception {
    new CalculatorModel();
    new CalculatorView();
        CalculatorController calculatorController = new CalculatorController(new CalculatorView(), new CalculatorModel());
    }
    private CalculatorView theView;
    private CalculatorModel theModel;



    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
            this.theView = theView;
            this.theModel = theModel;
// Tell the View that when ever the calculate button
// is clicked to execute the actionPerformed method
// in the CalculateListener inner class
            this.theView.addCalculateListener(new CalculateListener());
        }

        private class CalculateListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String firstNumber;
                int secondNumber = 0;
                // Surround interactions with the view with
                // a try block in case numbers weren't
                // properly entered
                try {
                    firstNumber = theView.getSourceCode();
                    theModel.countCharacters(firstNumber);
                    secondNumber = theModel.getint();

                    //addTwoNumbers(firstNumber, secondNumber);
                    theView.setcalcSolution(secondNumber);
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    theView.displayErrorMessage("You Need to Enter 2 Integers");
                }
            }
        }
    }

