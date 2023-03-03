import java.util.ArrayList;
import java.util.List;

public class Part1 {
  public static void main(String[] args) {

    System.out.println(cosineTheta(List.of(3.0, 4.0), List.of(4.0, 3.0)));
    System.out.println(cosineTheta(List.of(7.0, 1.0), List.of(5.0, 5.0)));

    System.out.println(
        cosineTheta(List.of(3.0, 4.0, 0.0), List.of(4.0, 4.0, 2.0)));

    System.out.println(
        cosineTheta(List.of(1.0, 0.0, 3.0), List.of(5.0, 5.0, 0.0)));
  }

  static double cosineTheta(List<Double> a, List<Double> b) {
    // HINT this is the formula for cosine theta - implement the methods for
    // dotProduct and
    //      magnitude below
    return dotProduct(a, b) / (magnitude(a) * magnitude(b));
  }

  /**
   * Calculates dot product of a vector represented as a list
   * @param v the vector
   * @return a scalar representing the magnitude of the vector
   */
  static double dotProduct(List<Double> a, List<Double> b) {
    // We haven't seen assert yet, but this will ensure the two vectors are the
    // same size
    assert a.size() == b.size();

    // TODO implement this method by iterating through the two lists

    double result = 0.0;
    for (int i = 0; i < a.size(); i++) {
      result += a.get(i) * b.get(i);
    }
    return result;
  }

  /**
   * Calculates magnitude of a vector  represented as a list
   * @param v the vector
   * @return a scalar representing the magnitude of the vector
   */
  static double magnitude(List<Double> v) {
    // TODO implement this method by iterating through the list
    // HINT Math.sqrt is the Java square root function
    double sumOfSquares = 0.0;
    for (double element : v) {
      sumOfSquares += Math.pow(element, 2);
    }
    return Math.sqrt(sumOfSquares);
  }
}
