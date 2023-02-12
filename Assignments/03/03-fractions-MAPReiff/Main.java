public class Main {
  public static void main(String[] args) {

    System.out.println(new Fraction(1, 7)
        .plus(new Fraction(4, 7)));

    System.out.println(new Fraction(1, 5)
        .plus(new Fraction(3, 7)));

    System.out.println(new Fraction(7, 15)
        .plus(new Fraction(1, 5)));

    System.out.println(new Fraction(7, 8)
        .minus(new Fraction(5, 16)));

    System.out.println(new Fraction(3,4)
        .times(new Fraction(1,2)));

  }
}
