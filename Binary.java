import java.util.*;
import java.io.*;

/**
 * Binary class
 *Converts binary numbers to decimal and hexadecimal numbers.
 * @author Cody Young
 * @version 2/17/2017
 */

public class Binary {
    //Instance variables for Binary class.
    String bin;                    //Input as String representation
    private PrintWriter pw;

    /**
     * Constructor method for Binary class objects.
     * @param pw Allows class access to PrintWriter object in Driver class.
     */
    public Binary (PrintWriter pw) {
        this.pw = pw;
    }

    /**
     * Calls methods to convert binary to decimal.
     */
    public void binToDec() {
        inputBin();
        toDec();
    }

    /**
     * Calls methods to convert binary to hex.
     */
    public void binToHex() {
        inputBin();
        toHex();
    }

    /**
     * Gets binary number from user input as a String.
     */
    private void inputBin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number:");
        pw.println("Enter binary number:");
        bin = sc.nextLine();
        pw.println(bin);
    }

    /**
     * Converts binary number to decimal number.
     */
    private void toDec() {
        int power = 1;  //Variable to track exponent
        int dec_result = 0;     //Variable to track addition of binary numbers

        int binint = Integer.parseInt(bin, 2);     //Parses binary string as an int

        while (binint!= 0) {
            //Take binary digit, multiply by 2 raised to exponent, add to result
            dec_result += (binint % 10) * power;
            binint = binint / 10;      //"Slice" binary number by each bit
            power *= 2;       //Increment power of 2
        }
        System.out.println("Decimal: " + dec_result);
        pw.println("Decimal: " + dec_result + '\n');
        pw.println('\n');
    }

    /**
     * Converts binary number to hex number.
     */
    private void toHex() {
        StringBuilder binstring = new StringBuilder();
        StringBuilder hex = new StringBuilder();      //Store hex conversion value

        binstring.append(bin);          //Adds binary number as string to StringBuilder

        for (int i = 0; i < binstring.length(); i += 4) {         //Sets position in string object Hex to appropriate value
                if (binstring.substring(i, i + 4).equals("0000")) {
                    hex.append('0');
                } else if (binstring.substring(i, i+4).equals("0001")) {
                    hex.append('1');
                } else if (binstring.substring(i, i+4).equals("0010")) {
                    hex.append('2');
                } else if (binstring.substring(i, i+4).equals("0011")) {
                    hex.append('3');
                } else if (binstring.substring(i, i +4).equals("0100")) {
                    hex.append('4');
                } else if (binstring.substring(i, i+4).equals("0101")) {
                    hex.append('5');
                } else if (binstring.substring(i, i+4).equals("0110")) {
                    hex.append('6');
                } else if (binstring.substring(i, i+4).equals("0111")) {
                    hex.append('7');
                } else if (binstring.substring(i, i+4).equals("1000")) {
                    hex.append('8');
                } else if (binstring.substring(i, i+4).equals("1001")) {
                    hex.append('9');
                } else if (binstring.substring(i, i+4).equals("1010")) {
                    hex.append('A');
                } else if (binstring.substring(i, i+4).equals("1011")) {
                    hex.append('B');
                } else if (binstring.substring(i, i+4).equals("1100")) {
                    hex.append('C');
                } else if(binstring.substring(i, i+4).equals("1101")) {
                    hex.append('D');
                } else if (binstring.substring(i, i+4).equals("1110")) {
                    hex.append('E');
                } else if (binstring.substring(i, i+4).equals("1111")) {
                    hex.append('F');
                }
        }
        System.out.println("Hex: " + hex.toString());
        pw.println("Hex: " + hex.toString() + '\n');
        pw.println('\n');
    }
}
