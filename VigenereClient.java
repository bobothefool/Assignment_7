/**
 * Test client for Vigenere cipher implementation
 * Demonstrates and verifies encryption/decryption functionality
 */
public class VigenereClient {
    public static void main(String[] args) {
        System.out.println("=== Basic Functionality Tests ===");
        testBasicEncryptionDecryption();
        
        System.out.println("\n=== Edge Case Tests ===");
        testEdgeCases();
        
        System.out.println("\n=== Special Scenario Tests ===");
        testSpecialScenarios();
    }
    
    private static void testBasicEncryptionDecryption() {
        // Test 1: Simple case with spaces
        Vigenere test1 = new Vigenere("Attack at Dawn", "cat");
        System.out.println("Test 1 - Simple phrase:");
        test1.encrypt();
        System.out.println(test1);
        
        // Test 2: Message shorter than key
        Vigenere test2 = new Vigenere("cat", "Attack");
        System.out.println("\nTest 2 - Message shorter than key:");
        test2.encrypt();
        System.out.println(test2);

    }
    
    private static void testEdgeCases() {
        // Test 3: Empty message
        Vigenere test3 = new Vigenere("", "key");
        System.out.println("\nTest 3 - Empty message:");
        test3.encrypt();
        System.out.println(test3);
        
        // Test 4: Single character key
        Vigenere test4 = new Vigenere("Attack at dawn", "a");
        System.out.println("\nTest 4 - Single character key:");
        test4.encrypt();
        System.out.println(test4);
    }
    
    private static void testSpecialScenarios() {
        // Test 5: Message and key are the same
        Vigenere test5 = new Vigenere("attack", "attack");
        System.out.println("\nTest 5 - Message and key identical:");
        test5.encrypt();
        System.out.println(test5);

        
        // Test 6: Longer password
        Vigenere test6 = new Vigenere("aaa", "cat cat");
        test6.encrypt();
        test6.decrypt();
        System.out.println("\nTest 6 - Original behavior:");
        System.out.println(test6);
        
    }
}
