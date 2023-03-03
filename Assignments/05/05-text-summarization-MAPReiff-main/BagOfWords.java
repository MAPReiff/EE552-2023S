import java.util.*;

public class BagOfWords {
  Map<String, Integer> bagOfWords = new HashMap<>();

  BagOfWords(List<String> words){
    // TODO Copy your solution from homework 5.3 here
    for (String word : words) {
      String lowerWord = word.toLowerCase();
      if (bagOfWords.containsKey(lowerWord)) {
        bagOfWords.put(lowerWord, bagOfWords.get(lowerWord) + 1);
      } else {
        bagOfWords.put(lowerWord, 1);
      }
    }
  }

  public BagOfWords(String s) {
    // NOTE this is slightly different from the constructor in 5.3.  To get better
    //      results in summarization, I'm filtering out a list of stop words.  Stop
    //      Words are very common words that don't add much meaning to the sentence.
    //      The list of stop words I'm using is from here:  https://www.ranks.nl/stopwords
    this(removeStopWords(Arrays.asList(s.toLowerCase()
        .replaceAll("[^\\w\\s]", " ")
        .replaceAll("\\s+", " ")
        .split(" "))));
  }

  static List<String> getVocabulary(List<BagOfWords> bags) {
    // TODO implement this method

    // HINT 1 - you need a way to get a list of unique words across multiple sentences.  Which type of Collection
    //          is designed to contain unique values.
    // HINT 2 - in order to make sure the vector representation s are stable, you will need to have
    //          a sorted list of words.  What's the way to copy the contents of one collection into another?

    Set<String> words = new LinkedHashSet<>();
    for (BagOfWords bag : bags) {
      words.addAll(bag.getWords());
    }
    return new ArrayList<>(words);
  }

  /**
   * Returns the frequency of the word in the sentence or zero if it does not appear
   * @param word the word to search
   * @return a frequency
   */
  public Integer get(String word) {
    return bagOfWords.getOrDefault(word, 0);
  }

  public Set<String> getWords(){
    return this.bagOfWords.keySet();
  }

  public int size() {
    return bagOfWords.size();
  }

  public static List<String> removeStopWords(List<String> words){
    final ArrayList<String> copyOfWords = new ArrayList<>(words);
    copyOfWords.removeAll(stopWords);
    return copyOfWords;
  }

  private static final List<String> stopWords = Arrays.asList(
      "a",
      "about",
      "above",
      "after",
      "again",
      "against",
      "all",
      "am",
      "an",
      "and",
      "any",
      "are",
      "aren't",
      "as",
      "at",
      "be",
      "because",
      "been",
      "before",
      "being",
      "below",
      "between",
      "both",
      "but",
      "by",
      "can't",
      "cannot",
      "could",
      "couldn't",
      "did",
      "didn't",
      "do",
      "does",
      "doesn't",
      "doing",
      "don't",
      "down",
      "during",
      "each",
      "few",
      "for",
      "from",
      "further",
      "had",
      "hadn't",
      "has",
      "hasn't",
      "have",
      "haven't",
      "having",
      "he",
      "he'd",
      "he'll",
      "he's",
      "her",
      "here",
      "here's",
      "hers",
      "herself",
      "him",
      "himself",
      "his",
      "how",
      "how's",
      "i",
      "i'd",
      "i'll",
      "i'm",
      "i've",
      "if",
      "in",
      "into",
      "is",
      "isn't",
      "it",
      "it's",
      "its",
      "itself",
      "let's",
      "me",
      "more",
      "most",
      "mustn't",
      "my",
      "myself",
      "no",
      "nor",
      "not",
      "of",
      "off",
      "on",
      "once",
      "only",
      "or",
      "other",
      "ought",
      "our",
      "ours",
      "ourselves",
      "out",
      "over",
      "own",
      "same",
      "shan't",
      "she",
      "she'd",
      "she'll",
      "she's",
      "should",
      "shouldn't",
      "so",
      "some",
      "such",
      "than",
      "that",
      "that's",
      "the",
      "their",
      "theirs",
      "them",
      "themselves",
      "then",
      "there",
      "there's",
      "these",
      "they",
      "they'd",
      "they'll",
      "they're",
      "they've",
      "this",
      "those",
      "through",
      "to",
      "too",
      "under",
      "until",
      "up",
      "very",
      "was",
      "wasn't",
      "we",
      "we'd",
      "we'll",
      "we're",
      "we've",
      "were",
      "weren't",
      "what",
      "what's",
      "when",
      "when's",
      "where",
      "where's",
      "which",
      "while",
      "who",
      "who's",
      "whom",
      "why",
      "why's",
      "with",
      "won't",
      "would",
      "wouldn't",
      "you",
      "you'd",
      "you'll",
      "you're",
      "you've",
      "your",
      "yours",
      "yourself",
      "yourselves"
  );
}
