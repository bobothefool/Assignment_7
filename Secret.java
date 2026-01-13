import java.util.Random;
/**
 * Code for assignment 7 part 1 (Secret task)
 *
 * @author Mehreen Sajid
 * @version 3/24/25
 */
public class Secret implements Encryptable
{
    // instance variables
    String msg;
    boolean encrypted;
    int shift;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    /**
     * Constructor for objects of class Secret
     */
    public Secret(String msg)
    {
        // initialise instance variables
        this.msg = msg;
        encrypted = false;
        Random randthing = new Random();
        shift = randthing.nextInt(4) + 1;
    }
    
    public static void main(String[] args) {
        // insert code here
    }
        
    /**
     * Encrypts a message using Caesar's encryption
     * 
     * match letter to letter in alphabet, find index
     * find letter in alphabet at shift + index
     *     if shift + index > 25, find letter in alphabet at (shift + index) - 26
     * add to temp
     * 
     * make everything uppercase & remove spaces beforehand
     * handle capital letters (manipulate input)
     */
    public void encrypt()
    {
        // put your code here
        String temp = "";
        for (int i = 0; i < msg.length(); i++) {
            if (!(msg.charAt(i) == (' '))) {
                int indexInMsg = i;
                char let = msg.charAt(indexInMsg);
                int indexInAlphabet = alphabet.indexOf(Character.toLowerCase(let));
                
                if (indexInAlphabet + shift > 25){
                    temp += alphabet.charAt(indexInAlphabet + shift - 26);
                } else {
                    temp += alphabet.charAt(indexInAlphabet + shift);
                }
            } else {
                temp += ' ';
            }
        }
        msg = temp;
        }
            
    /**
     * Decrypts a message encrypted with Caesar's encryption
     * match letter to letter in alphabet, find index
     * find letter in alphabet at index - shift
     *     if index - shift < 0, find letter in alphabet at 25 - (shift + index)
     * add to temp
     *
     * @return a string containing the decrypted message
     */
    public String decrypt()
    {
        // put your code here
        String temp = "";
        for (int i = 0; i < msg.length(); i++) {
            if (alphabet.indexOf(msg.charAt(i)) != -1) {
                int indexInMsg = i;
                char let = msg.charAt(indexInMsg);
                int indexInAlphabet = alphabet.indexOf(Character.toLowerCase(let));
                
                if (indexInAlphabet - shift < 0){
                    int change = indexInAlphabet - shift + 26; // 25 - indexInAlphabet - shift;
                    temp += alphabet.charAt(change);
                } else {
                    temp += alphabet.charAt(indexInAlphabet - shift); 
                }
            } else {
                temp += "" + msg.charAt(i);
            }
        }
        msg = temp;
        return msg;
    }
    
    /**
     * Returns whether the message is encrypted
     *
     * @return a boolean containing whether or not the message is encryped
     */
    public boolean isEncrypted()
    {
        // put your code here
        return encrypted;
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
}
    