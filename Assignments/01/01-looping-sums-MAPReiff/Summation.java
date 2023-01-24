//I pledge my honor that I have abided by the Stevens Honor System

public class Summation {
  /**
   * Calculates the sum of all integers from 1 to 100
   */
  public static int sum1to100() {
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      sum += i;
    }
    return sum;
  }

  /**
   * Calculates the sum of a harmonic series from n=1 to 100
   */
  public static float sumHarmonicForward() {
    float sum = 0;
    for (int i = 1; i <= 100; i++) {  // need to start at 1 as 1/0 would not play nice
      sum += (1/(float)i);    // as we are mixing in an int i, I am type casting it as float
    }
    return sum;
  }

  /**
   * Calculates the sum of the harmonic series from n = 100 to 1
   */
  public static float sumHarmonicBackward() {
    float sum = 0;
    for (int i = 100; i >= 1; i--) {    // same as above function, but goes the other way
      sum += (1/(float)i);
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum1to100());
    System.out.println(sumHarmonicForward());
    System.out.println(sumHarmonicBackward());
  }
}
