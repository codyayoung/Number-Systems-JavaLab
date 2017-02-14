import java.util.*;
import java.io.*;

/**
 * Decimal class
 * Converts decimal numbers to binary and hexadecimal numbers.
 * @author Cody Young   Palomar ID: 008372648
 * @version 2/17/2017
 */

public class Decimal {
    //Instance variables for Decimal class.
    int decimal;
    private PrintWriter pw;

    /**
     * Constructor method for Decimal class objects.
     * @param pw Allows class access to PrintWriter object in Driver class.
     */
    public Decimal(PrintWriter pw) {
        this.pw = pw;
    }

    /**
     * Calls methods to convert decimal to binary.
     */
    public void decToBin() {
          inputDec();
          toBin();
    }

    /**
     * Calls methods to convert decimal to hexadecimal.
     */
    public void decToHex() {
        inputDec();
        toHex();
    }

    /**
     * Gets decimal number from user input.
     */
    private void inputDec() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter decimal number:");
       pw.println("Enter decimal number:");
       decimal = sc.nextInt();
       pw.println(decimal);
    }

    /**
     * Converts a decimal to binary number.
     */
    private void toBin() {
        StringBuilder si = new StringBuilder();
        while (decimal > 0) {
            si.append(decimal % 2);     //Take remainder of division by 2
            decimal = decimal / 2;      //Divide number by 2
        }
        si.reverse();       //Reverse string for correct output
        System.out.println("Binary: " + si.toString());
        pw.println("Binary: " + si.toString() + '\n');
        pw.println('\n');
    }

    /**
     * Converts decimal to hexadecimal number.
     */
    public void toHex(){
        //Conversion instance variables
        StringBuilder sd = new StringBuilder();
        //Lookup table for hex characters
        char hex [] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        int modRem;     //Variable to store remainder of modulus
        String modResult = "";  //Variable to store result of modulus as string

        while (decimal > 0) {
            modRem = decimal % 16;    //Take remainder value from modulus operation
            modResult = hex[modRem] + modResult; //Go through lookup table, find correct value
            decimal = decimal / 16;  //Divide to get next value
        }
        sd.reverse();   //Reverses string for correct output
        sd.append(modResult);
        System.out.println("Hex: " + sd.toString());
        pw.println("Hex: " + sd.toString() + '\n');
        pw.println('\n');
    }
}
