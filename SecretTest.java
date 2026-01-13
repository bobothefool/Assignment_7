
/**
 * Code for assignment 7 part 1 (Secret task)
 *
 * @author Mehreen Sajid
 * @version 3/25/25
 */
public class SecretTest
{
    // instance variables

    /**
     * Constructor for objects of class Secret
     */
    public SecretTest()
    {
        // initialise instance variables
        
    }

    public static void main(String[] args) {
        // insert code here
        Secret hush = new Secret("act like an angel");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Secret("and dress like crazy");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Secret("all the girls are garlic garlic");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("decrypted: " + hush.toString() + "\n");
        
        hush = new Secret("all the garlic girls");
        System.out.println("secret: " + hush.toString());
        
        hush.encrypt();
        System.out.println("encrypted: " + hush.toString());
        
        hush.decrypt();
        System.out.println("eecrypted: " + hush.toString());
    }
}
