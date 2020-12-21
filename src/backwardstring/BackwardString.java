package backwardstring;
import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 * Assignment 5
 * 11/01/2020
 * Objective: Write a method that accepts user input as a string, then displays 
 * the letters backwards. 
 */
public class BackwardString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\tEnter String Text here : ");
        input= keyboard.next();

        // calling backward method to reverse passed string
        backward(input);
        keyboard.close();
    } 
    
    // Method to Reverse the input string
    private static void backward(String source) {

        int i, len = source.length();
        StringBuilder word = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--)
        {
            word.append(source.charAt(i));
        }

        System.out.println("\tReversed String Text : "+word);
        System.out.println("\n");

    }

}

