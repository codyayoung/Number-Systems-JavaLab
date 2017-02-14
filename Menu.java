import java.util.*;
import java.io.*;

/**
 * Menu class
 * Main menu selection options.
 * @author Cody Young
 * @version 2/17/2017
 */

public class Menu {

    //Instance variables for menu selection.
    int selection;
    private PrintWriter pw;

    /**
     * Constructor method for Menu class objects.
     * @param pw Allows class access to PrintWriter object in Driver class.
     */
    public Menu(PrintWriter pw) {
        this.pw = pw;
    }

    /**
     * Creates classic terminal style window.
     */
    public void display() {
        System.out.println("THE ULTIMATE NUMBER CONVERTER MARK IV VERSION 5.016");
        pw.println("THE ULTIMATE NUMBER CONVERTER MARK IV VERSION 5.016\n");
        System.out.println("----------------------------------------");
        pw.println("----------------------------------------\n");
        System.out.println("1.) Decimal to Binary");
        pw.println("1.) Decimal to Binary\n");
        System.out.println("2.) Decimal to Hex");
        pw.println("2.) Decimal to Hex\n");
        System.out.println("3.) Binary to Decimal");
        pw.println("3.) Binary to Decimal\n");
        System.out.println("4.) Binary to Hexadecimal");
        pw.println("4.) Binary to Hexadecimal\n");
        System.out.println("5.) Hexadecimal to Decimal");
        pw.println("5.) Hexadecimal to Decimal\n");
        System.out.println("6.) Hexadecimal to Binary");
        pw.println("6.) Hexadecimal to Binary\n");
        System.out.println("7.) Exit program");
        pw.println("7.) Exit program\n");
        System.out.println("");
        pw.println("");
    }

    /**
     * Gets user input for menu.
     *
     * @return Number selected by user.
     */
    public int getSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter selection:");
        pw.print("Enter selection:");
        selection = sc.nextInt();
        pw.println(selection);
        return selection;
    }
}
