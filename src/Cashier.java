
import java.io.PrintWriter;

public class Cashier {

    private int dollar = 0, qtr = 0, dime = 0, nkl = 0, pen = 0;
    private int _amountRecieved;
    private int _amountDue;
    private PrintWriter _out;

    /***
     *
     * @param amountDue - present sum that should be paid
     * @param amountReceived - presents sum that was paid
     * @param out - present Printer
     */
    public Cashier(int amountDue, int amountReceived, PrintWriter out) {
        _amountRecieved = amountReceived;
        _amountDue= amountDue;
        _out=out;
    }

    /***
     * Method count and display change for the Customer
     */
    public void DisplayChange() {

        int change = _amountRecieved - _amountDue;


        if (change >= 100)
        dollar = change/100;
        change -=dollar*100 ;
	    qtr = change / 25;
        change -=qtr * 25;
	    dime = change / 10;
        change-=dime * 10;
	    nkl = change / 5;
        change -=nkl * 5;
	    pen = change;

        _out.printf("------------------------\n");
        _out.printf("Customer's check:\n");
        _out.printf("------------------------\n");
        _out.printf("Amount due:      %d pennies\n", _amountDue);
        _out.printf("Amount paid:     %d pennies\n", _amountRecieved);
        _out.printf("Cash back total: %d pennies\n", _amountRecieved - _amountDue);
        _out.printf("Take change:\n");
        _out.printf("Dollars: %d pcs\n", dollar);
        _out.printf("Quaters: %d pcs\n", qtr);
        _out.printf("Dimes:   %d pcs\n", dime);
        _out.printf("Nickels: %d pcs\n", nkl);
        _out.printf("Pennies: %d pcs\n", pen);

    }


}
