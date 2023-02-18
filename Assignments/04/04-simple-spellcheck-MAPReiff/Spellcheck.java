import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Spellcheck {

  private static final Set<String> words = new HashSet<String>();

  public static void main(String[] args) {
    /* HINT - use a BufferedReader to read the words file.  For each line in
              the file, call words.add(line) . We will be covering Sets in
       detail next week, but for now just know that if you are adding each word
              to the set of known words so that spellcheck will work
     */
    try {
      // write code to read words.txt here
      BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
      String line = reader.readLine();
      while (line != null) { // aka when there is actual stuff on the line up
                             // till end of file
        words.add(line.trim());
        line = reader.readLine();
      }
      reader.close();

      spellCheckFile("peter-pan.txt");
      spellCheckFile("alice.txt");
      spellCheckFile("original.txt");
      // I noticed the 2 given examples had minimal or no
      // punctuation, so I stripped most of it from my file
      // as well.

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Reads the contents of filename line-by-line and prints the line with
   * spellchecking markup.  Please preserve the linebreaks from the original
   * file.
   *
   * NOTE - this method is written with "throws IOException" at the end of the
   * declaration. That means that we are passing the burden of handling the
   * IOException to the code that calls this method.  That means, in turn, that
   * you do not need to use Try/Catch inside this method.
   *
   * @param filename the name of the file to read
   * @throws IOException
   */
  static void spellCheckFile(String filename) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line = reader.readLine();
    while (line != null) { // same as above, read each valid line
      String[] lineWords = line.split(" ");
      for (String word : lineWords) {
        if (!isSpelledCorrectly(word)) {
          System.out.print("[[" + word + "]] ");
        } else {
          System.out.print(word + " ");
        }
      }

      line = reader.readLine();
    }
    System.out.println("\n");
    reader.close();
  }

  /**
   * Returns true if the word is in the list of known words of false otherwise
   * @param word the word to check
   * @return
   */
  private static boolean isSpelledCorrectly(String word) {
    return words.contains(word) ||
        words.contains(word.toLowerCase(Locale.ROOT));
  }
}
