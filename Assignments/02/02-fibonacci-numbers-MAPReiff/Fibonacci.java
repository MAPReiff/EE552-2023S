//I pledge my honor that I have abided by the Stevens Honor System.

public class Fibonacci {
  /**
   * Calculates the nth Fibonacci number recursively
   */
  public static int fibonacci(int n) {
    if (n <= 1) { // if n is 1 or 0, return itself
      return n;
    } else { // else return the sum of the next two lower levels of fibonacci value
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(10));
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(20));
    System.out.println(fibonacci(8));
  }
}
