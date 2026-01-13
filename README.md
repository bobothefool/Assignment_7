# Assignment 7: Vigenere Encryption
Assignment 7 from CS 230: Data Structures &amp; Algorithms. Takes a message and either encrypts or decrypts it using Vigenere's method.

# Contents
Note: files and directories that are part of the assignment template were made by the professor of this class, and not relevant or usable.
* `doc`: Directory containing `.html` copies of classes made; **part of template for assignment**
* `Encryptable.java`: Interface for objects that are able to be encrypted or decrypted
* `README.TXT`: defunct README file; **part of template for assignment**
* `README.md`: this file
* `Secret.java`: Implementation of `Encryptable.java`, used to create encryptable/decryptable messages with **Caesar's** encryption
* `SecretTest.java`: Contains the main, tests the `decrypt()` and `encrypt()` methods in `Secret.java`
* `Vigenere.java`: Class used to create an encryptable/decryptable message, and encrypt/decrypt it
* `VigenereClient.java`: Class used to test `encrypt()` and `decrypt()` methods in `Vigenere.java` and different cases; **part of template for assignment**
* `VigenereTest.java`: **My** test methods for `Vigenere.java`; tests a variety of cases, such as sentences with spaces, and upper and lowercase words
* `package.bluej`: File created by IDE (BlueJ); **part of template for assignment** (by IDE)
* `vigenereTest.txt`: Output of `VigenereTest.java`

# VigenereTest Output
This is a summary of the inputs and outputs put through the `Vigenere` class, listed in `vigenereTest.txt`.

| Secret Word | Encrypted Output |
| ----------- | ----------- |
| CAT | CTN |
| CARS | EALU |
| cat | CTN |
| aaa | CAT |
| Attack at dawn | CTNCCECTWCWH |
| attack | ANNAEU |

# Getting Started
1. Download the `.java` files - you do not need to download the `doc` directory, `.DS_Store` (this is a file that Mac creates for every folder), and `package.bluej`. (You may download `vigenereTest.txt` as a reference for the correct output.)
2. Use the `VigenereClient.java` or `SecretTest.java` files to play around with encrypting and decrypting secret messages.