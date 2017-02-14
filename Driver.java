import java.io.*;


/**
 * Number Systems Lab
 * Tests variables and runs main menu.
 * @author Cody Young
 * @version 2/17/2017
 */

/*
TODO LIST
Make sure binary numbers are separated by nibbles
Generate HTML Javadocs
 */

public class Driver {

    public static void main (String [] args) throws IOException{
        int choice;

        PrintWriter pw = new PrintWriter (new FileWriter("csis.txt"));
        Decimal dec = new Decimal(pw);
        //Decimal dec = new Decimal();    //FOR TESTING PURPOSES ONLY
        Binary bin = new Binary(pw);
        //Binary bin = new Binary();      //FOR TESTING PURPOSES ONLY
        Hexadecimal hex = new Hexadecimal(pw);
        //Hexadecimal hex = new Hexadecimal();    //FOR TESTING PURPOSES ONLY
        Menu menu = new Menu(pw);
        //Menu menu = new Menu(); //FOR TESTING PURPOSES ONLY.print("TESTING 123");

        do{                                            
            menu.display();
            choice = menu.getSelection();
            switch(choice){
                case 1 : dec.decToBin(); break;
                case 2 : dec.decToHex(); break;
                case 3 : bin.binToDec(); break;
                case 4 : bin.binToHex(); break;
                case 5 : hex.hexToDec(); break;
                case 6 : hex.hexToBin(); break;
            }                                                       
        } while (choice != 7);
        pw.close();
    }
}

