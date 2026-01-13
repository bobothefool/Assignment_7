
/**
 * Code for assignment 7 part 1 (Secret task)
 *
 * @author Mehreen Sajid
 * @version 3/25/25
 */
public interface Encryptable
{
    /**
     * Encrypts a message
     * Generates a random number to shift each letter index by in the constructor
     */
    public void encrypt(); 
    
    /**
     * Decrypts an encrypted a message
     * 
     * @return the decrypted message as a String
     */
    public String decrypt();
}
