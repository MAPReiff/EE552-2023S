public class Fraction {
  private final int numerator;
  private final int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  /**
   * Calculates the sum of two fractions
   * @param other the other fraction
   * @return the sum of this fraction and the other in lowest terms
   */
  public Fraction plus(Fraction other) {
    int newNumerator = 0;   // Replace 0 with the correct calculation
    int newDenominator = 0; // Replace 0 with the correct calculation

    newNumerator =
        this.numerator * other.denominator + other.numerator * this.denominator;
    newDenominator = this.denominator * other.denominator;

    return new Fraction(newNumerator, newDenominator).reduce();
  }

  /**
   * Calculates the difference of two fractions
   * @param other the other fraction
   * @return the difference between this fraction and the other in lowest terms
   */
  public Fraction minus(Fraction other) {
    int newNumerator = 0;   // Replace 0 with the correct calculation
    int newDenominator = 0; // Replace 0 with the correct calculation

    newNumerator =
        this.numerator * other.denominator - other.numerator * this.denominator;
    newDenominator = this.denominator * other.denominator;

    return new Fraction(newNumerator, newDenominator).reduce();
  }

  /**
   * Calculates the product of two fractions
   * @param other the other fraction
   * @return the product of this fraction and the other fraction in lowest terms
   */
  public Fraction times(Fraction other) {
    int newNumerator = 0;   // Replace 0 with the correct calculation
    int newDenominator = 0; // Replace 0 with the correct calculation

    newNumerator = this.numerator * other.numerator;
    newDenominator = this.denominator * other.denominator;

    return new Fraction(newNumerator, newDenominator).reduce();
  }

  /**
   * Reduces a fraction by dividing the numerator and denominator by the
   * greatest common factor.
   * @return a reduced fraction
   */
  public Fraction reduce() {
    int newNumerator = 0;   // Replace 0 with the correct calculation
    int newDenominator = 0; // Replace 0 with the correct calculation

    newNumerator = this.numerator;
    newDenominator = this.denominator;
    int gcd = gcd(newNumerator, newDenominator);
    newNumerator /= gcd;
    newDenominator /= gcd;

    return new Fraction(newNumerator, newDenominator);
  }

  private int gcd(int a, int b) {
    // implement Euclid's algorithm
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  // DO NOT EDIT THIS FUNCTION
  @Override
  public String toString() {
    return "(" + numerator + " / " + denominator + ')';
  }
}
