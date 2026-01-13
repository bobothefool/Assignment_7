
/**
 * Code for assignment 7 part 1 (Secret task)
 *
 * @author Mehreen Sajid
 * @version 3/27/25
 */
public class VigenereTest
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class VigenereTest
     */
    public VigenereTest()
    {
        // initialise instance variables
        
    }

    public static void main(String[] args) {
        // insert code here
        Vigenere hush = new Vigenere("CAT", "ATT");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Vigenere("CARS", "CAT");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Vigenere("cat", "Attack");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Vigenere("aaa", "cat");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Vigenere("Attack at Dawn", "cat");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Vigenere("attack", "at tack");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
    }
}
