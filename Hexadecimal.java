import java.util.*;
import java.io.*;

/**
 * Hexadecimal class
 * Converts hex numbers to decimals.
 * @author Cody Young
 * @version 2/17/2017
 */

public class Hexadecimal {
    //Instance variables
    String hex;
    private PrintWriter pw;

    /**
     * Constructor method Hexadecimal class objects.
     * @param pw Allows class access to PrintWriter object in Driver class.
     */
    public Hexadecimal (PrintWriter pw) {
        this.pw = pw;
    }

    /**
     * Calls methods to convert hexadecimal to decimal.
     */
    public void hexToDec() {
        inputHex();
        toDec();
    }

    /**
     * Calls methods to convert hexadecimal to binary.
     */
    public void hexToBin() {
        inputHex();
        toBin();
    }

    /**
     * Gets hex number from user input as a String.
     */
    private void inputHex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hex number:");
        pw.println("Enter hex number:");
        hex = sc.nextLine();
        pw.println(hex);
    }

    /**
     * Converts hex number to a decimal number.
     */
    private void toDec() {
        StringBuilder hexstring = new StringBuilder();      //Put hex input into a new StringBuilder object
        String hexDigits = "0123456789ABCDEF";      //Lookup string for hex values: the ASCII table strikes back
        int dec_result = 0;     //Store decimal result

        hexstring.append(hex);      //Add hex input to StringBuilder

        for(int i = 0; i < hexstring.length(); i++){    //Loop through StringBuilder hexstring
            char tracker = hexstring.charAt(i);     //Track num/char hex value in hexstring
            int hd = hexDigits.indexOf(tracker);    //For each char in hexstring, get decimal ASCII value by hexDigits lookup string
            dec_result = 16 * dec_result + hd;      //Add decimal values, multiply by 16 to get result
        }
        System.out.println("Decimal: " + dec_result);
        pw.println("Decimal: " + dec_result + '\n');
        pw.println('\n');
    }

    /**
     * Converts hex number to binary number.
     */
    private void toBin() {
        StringBuilder hexstring = new StringBuilder();
        StringBuilder bin = new StringBuilder();        //Store binary conversion value

        hexstring.append(hex);

        for(int i = 0; i < hexstring.length(); i++) {
            if (hexstring.substring(i, i+1).equals("0")) {
                bin.append("0000");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("1")) {
                bin.append("0001");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("2")) {
                bin.append("0010");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("3")) {
                bin.append("0011");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("4")) {
                bin.append("0100");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("5")) {
                bin.append("0101");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("6")) {
                bin.append("0110");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("7")) {
                bin.append("0111");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("8")) {
                bin.append("1000");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("9")) {
                bin.append("1001");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("A")) {
                bin.append("1010");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("B")) {
                bin.append("1011");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("C")) {
                bin.append("1100");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("D")) {
                bin.append("1101");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("E")) {
                bin.append("1110");
                bin.append(" ");
            }
            else if (hexstring.substring(i, i+1).equals("F")) {
                bin.append("1111");
                bin.append(" ");
            }
        }
        System.out.println("Binary: " + bin.toString());
        pw.println("Binary: " + bin.toString() + '\n');
        pw.println('\n');
    }
}
