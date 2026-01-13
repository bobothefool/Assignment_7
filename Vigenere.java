import java.util.Random;
/**
 * Code for assignment 7 part 1 (Secret task)
 *
 * @author Mehreen Sajid
 * @version 3/27/25
 */
public class Vigenere
{
    // instance variables - replace the example below with your own
    String msg;
    String pass;
    boolean encrypted;
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Constructor for objects of class Vigenere
     */
    public Vigenere(String msg, String pass)
    {
        // initialise instance variables
        this.msg = msg;
        encrypted = false;
        this.pass = pass;
    }
    
    /**
     * Converts all the letters in msg to uppercase and removes non-space chars
     */
    public void convert()
    {
        // put your code here
        String temp = "";
        for (int i = 0; i < msg.length(); i++) {
            if (Character.isLetter(msg.charAt(i))) {
                temp += Character.toUpperCase(msg.charAt(i));
            }
        }
        msg = temp;
    }
    
    /**
     * Converts all the letters in pass to uppercase and removes non-space chars
     */
    public void convertPass()
    {
        // put your code here
        String temp = "";
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isLetter(pass.charAt(i))) {
                temp += Character.toUpperCase(pass.charAt(i));
            }
        }
        pass = temp;
    }
    
    /**
     * Encrypts a message using Vigenere's encryption
     */
    public void encrypt()
    {
        // put your code here
        convert();
        convertPass();
        String temp = "";
        
        for (int index = 0; index < msg.length(); index++) {
            if (Character.isLetter(msg.charAt(index))) {
                int let = alphabet.indexOf(msg.charAt(index)); //msg.charAt(index);
                if (msg.length() > pass.length()) {
                    pass += pass;
                }
                int p = alphabet.indexOf(pass.charAt(index)); // pass.charAt(index); // index of pass char
            
                if ((let + p) > (25)) {
                    temp += alphabet.charAt((let + p) - 25);
                } else {
                    temp += alphabet.charAt(let + p);
                }
            }
        }
        msg = temp;
    }
        
    /**
     * Decrypts a message encrypted with Vigenere's encryption
     * 
     * i: index in msg
     * shiftLet: ascii code
     * 
     * capital letters: 65-90
     *
     * @return a string containing the decrypted message
     */
    public String decrypt() {
        String temp = "";
        for (int index = 0; index < msg.length(); index++) {
            char let = msg.charAt(index);
            if (msg.length() > pass.length()) {
                pass += pass;
            }
            char p = pass.charAt(index); // index of pass char
            
            if ((let - p) < 0) {
                temp += alphabet.charAt(alphabet.length() - 1 + (let - p));
            } else {
                temp += alphabet.charAt(let - p);
            }
        }
        msg = temp;
        return msg;
    }
    
    /**
     * Returns the message as a string
     * 
     * @return
     */
    public String toString()
    {
        // put your code here
        return msg;
    }
    
    // public String decrypt()
    // {
        // // put your code here
        // String temp = "";
        // for (int i = 0; i < msg.length(); i++) {
            // if (Character.isLetter(msg.charAt(i))) {
                // // isLetter() guide from TutorialsPoint
                // int indexInMsg = i; // index of encrypted letter
                // char let = Character.toLowerCase(msg.charAt(indexInMsg)); // encrypted letter
                // int indexInAlphabet = alphabet.indexOf(let);
                // int shift = indexInAlphabet - (indexInAlphabet/2); //issue here
                    
                // System.out.println(let + " becomes " + alphabet.charAt(shift));
                // System.out.println("shift is: " + shift);
                
                // if (shift > 12){ //issue here
                    // temp += "0"; //Character.toUpperCase(alphabet.charAt(shift + 12))
                // } else {
                    // temp += Character.toUpperCase(alphabet.charAt(Math.round(shift)));
                // }
            // }
        // }
        // msg = temp;
        // return msg;
    // }
    
    // for (int index = 0; index < msg.length(); index++) {
            // if (Character.isLetter(msg.charAt(index))) {
                // int shiftLet = msg.charAt(index) - 'A'; // index of msg char
                // if (msg.length() > pass.length()) {
                    // pass += pass;
                // }
                // int shiftPass = pass.charAt(index) - 'A'; // index of pass char
            
                // if (shiftLet + shiftPass > (alphabet.length() - 1)) {
                    // temp += Character.toUpperCase(alphabet.charAt(shiftLet + shiftPass - (alphabet.length() - 1))); 
                // } else {
                    // temp += Character.toUpperCase(alphabet.charAt(shiftLet + shiftPass));
                // }
            // }
        // }
        
    // (p+1) % p.length()
    // (shiftPass + 1) % pass.length()
}
