import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

/**
 * Assignment 3 program 4.9
 * @author Sergei Chekhonin
 * This program display change for customer's payment
 */
public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter amount due to pay:");
        int number1 = parseInt(input);
        input = JOptionPane.showInputDialog("Enter amount paid (in pennies):");
        int number2 = parseInt(input);

        PrintWriter out = null;
        try {
            out = new PrintWriter("Assignment3_P4.9output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Cashier cashier = new Cashier( number1, number2 , out);
        cashier.DisplayChange();

        out.close();
    }
}
