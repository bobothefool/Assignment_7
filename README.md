# Assignment 7: Vigenere Encryption
Assignment 7 from CS 230: Data Structures &amp; Algorithms. Takes a message and either encrypts or decrypts it using Vigenere's method.

# Vigenere's Cipher
This type of encryption requires two things: a message to be encrypted/decrypted, and a "password." Each letter is assigned a number value from 0-25; in this project, capitalized letters are made to be lowercase. Each letter in the message corresponds to a letter in the password -- if the password is shorter, then it is simply "stretched," or repeated to make it longer. 

To encrypt the message, each letter in it is shifted ahead by the value of its corresponding letter in the password. For example: in the case where the message is "CAT" and the password is "ATT," the encrypted message is as follows: 

| Message | Password | Encrypted letter |
| ----------- | ----------- | ----------- |
| C | A | C |
| A | T | T |
| T | T | N |

So, using the password "ATT," "CAT" becomes "CTN"

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

| Secret Word | Encrypted Output | Password |
| ----------- | ----------- | ----------- |
| CAT | CTN | ATT |
| CARS | EALU | CAT |
| cat | CTN | Attack |
| aaa | CAT | cat |
| Attack at dawn | CTNCCECTWCWH | cat |
| attack | ANNAEU | at tack |

# Getting Started

# Installing & Running
1. Download the `.java` files - you do not need to download the `doc` directory, `.DS_Store` (this is a file that Mac creates for every folder), or `package.bluej`. 
    * You may download `vigenereTest.txt` as a reference for the correct output.
2. Use the `VigenereClient.java` or `SecretTest.java` files to play around with encrypting and decrypting secret messages.

Note that the `Vigenere` class constructor requires two arguments: a message to be encrypted/decrypted, and a "password" to shift the message characters by. See "Vigenere's Cipher" for how it works.
