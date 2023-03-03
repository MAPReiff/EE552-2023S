import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Part4 {
  public static void main(String[] args) {
    List<BagOfWords> documents = new ArrayList<>();

    try {
      // The below line is an alternate way of reading from files compared to
      // what we looked at in class.  This is part of the java.nio.  We will
      // look at it more detail in the second half of the semester
      final List<String> lines = Files.readAllLines(Paths.get("article.txt"));

      for (String line : lines) {
        documents.add(new BagOfWords(line));
      }

      final List<String> vocab = BagOfWords.getVocabulary(documents);
      final TfIdf tfIdf = new TfIdf(vocab, documents);

      List<List<Double>> vectors = new ArrayList<>();
      for (BagOfWords document : documents) {
        vectors.add(tfIdf.tfIdf(document));
      }

      List<List<Double>> matrix = new ArrayList<>();
      for (int i = 0; i < vectors.size(); i++) {
        List<Double> row = new ArrayList<>();
        for (int j = 0; j < vectors.size(); j++) {
          double cosine = cosineSimilarity(vectors.get(i), vectors.get(j));
          row.add(cosine);
        }
        matrix.add(row);
      }

      Map<Double, Integer> indexes = new HashMap<>();
      for (int i = 0; i < matrix.size(); i++) {
        List<Double> row = matrix.get(i);
        double average = calculateAverage(row);
        indexes.put(average, i);
      }

      printTopN(lines, indexes, 5);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static double calculateAverage(List<Double> doubles) {
    double sum = 0.0;
    for (Double d : doubles) {
      sum += d;
    }
    return sum / doubles.size();
  }

  private static double cosineSimilarity(List<Double> a, List<Double> b) {
    double dotProduct = 0.0;
    double aMagnitude = 0.0;
    double bMagnitude = 0.0;
    for (int i = 0; i < a.size(); i++) {
      dotProduct += a.get(i) * b.get(i);
      aMagnitude += Math.pow(a.get(i), 2);
      bMagnitude += Math.pow(b.get(i), 2);
    }
    aMagnitude = Math.sqrt(aMagnitude);
    bMagnitude = Math.sqrt(bMagnitude);
    double cosine = dotProduct / (aMagnitude * bMagnitude);
    return cosine;
  }

  public static class TfIdf {

    private final List<Double> idfVector;
    private final List<String> vocab;

    public TfIdf(List<String> vocab, List<BagOfWords> documents) {
      this.vocab = vocab;
      this.idfVector = Part3.inverseDocumentFrequency(vocab, documents);
    }

    public List<Double> tfIdf(BagOfWords document) {
      final List<Double> termFreq = Part2.termFrequency(this.vocab, document);
      return hadamardProduct(termFreq, idfVector);
    }

    /**
     * Returns the element-wise product of two equal sized vectors as a new
     *vector
     *
     * @param a a vector
     * @param b another vector of the same size
     * @return the product
     **/

     public static List<Double> hadamardProduct(List<Double> a, List<Double> b) {
      List<Double> result = new ArrayList<>();
      for (int i = 0; i < a.size(); i++) {
        result.add(a.get(i) * b.get(i));
      }
      return result;
    }
  }
    /**
 * Will print N sentences as a summary of the article
 *
 * @param lines   the lines of the file
 * @param indexes a mapping from the similarity score to the position of the sentence with that score
 * @param n       the number of sentences to extract
 */
private static void printTopN(List<String> lines, Map<Double, Integer> indexes, int n) {
  // NOTE - this uses some advanced Java 8 features we haven't discussed yet.  It will be the
  //        topic of week 12 of the course.  For now, just trust me that it works.
  indexes
      .keySet()
      .stream()
      .sorted(Comparator.reverseOrder())
      .limit(n)
      .map(indexes::get)
      .sorted()
      .map(lines::get)
      .forEach(System.out::println);

}

    
  
}