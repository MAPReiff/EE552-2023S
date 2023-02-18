import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decrypt {

  /**
   * Reads the contents of the file into a String
   * @param filename the name of the file to read
   * @return the contents of the file
   */
  public static String readFile(String filename) {
    String line = ""; // use a BufferedReader to read this from the file
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
      String lineWords;
      while ((lineWords = reader.readLine()) != null) {
        line += lineWords + "\n";
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return line;
  }

  public static void writeToFile(String filename, String contents) {
    // use a BufferedWriter to write the string contents to the file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
      writer.write(contents);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Loops through each character in the string and, if the character is a
   * letter, transforms it with the ROT13 cipher.  If the character is not a
   * letter, it should just return the same character unchanged.
   *
   * @param str the input  string
   * @return the encrypted string
   */
  public static String rot13(String str) {
    /*
      Hint 1: Remember each character has a numerical value, which means you can
              do math with characters.
      Hint 2: In ASCII, all of the capital letters have consecutive numerical
      values and all of the lowercase letters have consecutive values, BUT there
      is a gap between capital 'Z' and lowercase 'a' Hint 3: You can use
      concatenation here to assemble th new string, however, the better way to
              do it would be using something called a StringBuilder.  We will
      cover StringBuilder in more detail next week, but you may want to read the
      documentation for that class and experiment with using it in this
      assignment.
     */
    // String decrypted = "";
    StringBuilder decrypted = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      if (character >= 'A' && character <= 'Z') { // check uppercase
        decrypted.append(
            (char)(((character - 'A') + 13) % 26 + 'A')); // shift the character
      } else if (character >= 'a' && character <= 'z') {  // or lower case
        decrypted.append((char)(((character - 'a') + 13) % 26 + 'a')); // shift but lowercase
      } else { // or not a letter (such as a , or a !)
        decrypted.append(character);
      }
    }
    return decrypted.toString();
  }

  public static void main(String[] args) {
    writeToFile("decrypted.txt", rot13(readFile("encrypted.txt")));
  }
}
