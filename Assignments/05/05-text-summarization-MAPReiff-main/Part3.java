import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part3 {
  public static void main(String[] args) {

    final BagOfWords bagOfWords1 = new BagOfWords("This is Spot. See Spot run. Run, Spot, Run.");
    final BagOfWords bagOfWords2 = new BagOfWords("This is Jane. See Spot run to Jane.");

    final List<BagOfWords> documents = Arrays.asList(
        bagOfWords1, bagOfWords2
    );
    final List<String> vocab = BagOfWords.getVocabulary(documents);
    System.out.println(inverseDocumentFrequency(vocab, documents));
  }

  static List<Double> inverseDocumentFrequency(List<String> vocabulary, List<BagOfWords> documents){
    // TODO implement this method using the formula in the assignment description

    // HINT this requires iteration through both the vocabulary and the documents lists
    List<Double> idfVector = new ArrayList<>();
    int numDocuments = documents.size();

    // Calculate the number of documents that contain each term in the vocabulary
    Map<String, Integer> documentFrequency = new HashMap<>();
    for (String term : vocabulary) {
      int docsWithTerm = 0;
      for (BagOfWords document : documents) {
        if (document.get(term) > 0) {
          docsWithTerm++;
        }
      }
      documentFrequency.put(term, docsWithTerm);
    }

    // Calculate the IDF value for each term in the vocabulary
    for (String term : vocabulary) {
      int docsContainingTerm = documentFrequency.get(term);
      double idf = Math.log((double) numDocuments / docsContainingTerm);
      idfVector.add(idf);
    }

    return idfVector;
  }
}
