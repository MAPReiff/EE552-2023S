import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part2 {
  public static void main(String[] args) {
    // TODO copy your solution to the Bag of Words Assignment into the Bag of Words class in this assignment

    final BagOfWords bagOfWords1 = new BagOfWords("This is Spot. See Spot run. Run, Spot, Run.");
    final BagOfWords bagOfWords2 = new BagOfWords("This is Jane. See Spot run to Jane.");

    // TODO implement the method getVocabulary in BagOfWords
    final List<String> vocab = BagOfWords.getVocabulary(
        Arrays.asList(
            bagOfWords1, bagOfWords2
        ));

    System.out.println(termFrequency(
        vocab,
        bagOfWords1
    ));

    System.out.println(termFrequency(
        vocab,
        bagOfWords2
    ));
  }

  static List<Double> termFrequency(List<String> vocabulary, BagOfWords bagOfWords){
    // TODO implement this calculate method per the formula in the assignment description
    // HINT - I added a size method to the BagOfWords class that you can use for part of this calculation
    List<Double> tfValues = new ArrayList<>();
    int bagOfWordsSize = bagOfWords.size();
    for(String word: vocabulary){
        int count = bagOfWords.get(word);
        double tf = count / (double) bagOfWordsSize;
        tfValues.add(tf);
    }
    return tfValues;
  }
}
