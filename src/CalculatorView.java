/**
 * Created by magnus on 2017-01-27.
 */
// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it.

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CalculatorView extends JFrame {
  //  private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("Skriv in URL ");
    //Scanner tgb = new Scanner(System.in);
    //String url = tgb.nextLine();
   // private JTextField URL = new JTextField("http//"+ URL);
    private JButton calculateButton = new JButton("Show number of characters in source");
    private JTextField calcSolution = new JTextField(10);
   

    CalculatorView() {

        JPanel showChar = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        //Scanner tgb = new Scanner(System.in);
        //String url = tgb.nextLine();

        // Sets up the view and adds the components
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        // calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        // calcPanel.add(secondNumber);

        calcPanel.add(calculateButton);

        calcPanel.add(calcSolution);
        this.add(calcPanel);
        this.setVisible(true);
       // End of setting up the components --------
    }

   // public int getFirstNumber() {
  //      return Integer.parseInt(firstNumber.getText());


    //public String getURL() {
     // return (URL.getText());
    //}

    public String getSourceCode() {
    return (calcSolution.getText());
    }

   public void setcalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}