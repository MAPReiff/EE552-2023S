import java.util.ArrayList;
import java.util.List;

public class ListsOfInts {
  public static List<Integer> getOdds() {
    // Write code here
    List<Integer> odds = new ArrayList<Integer>();
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 1) {
        odds.add(i);
      }
    }

    return odds;
  }

  public static List<Integer> getEvens() {
    // Write code here
    List<Integer> evens = new ArrayList<Integer>();

    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        evens.add(i);
      }
    }
    return evens;
  }

  public static List<Integer> getPowersOfTwo() {
    // Write code here
    List<Integer> powers = new ArrayList<Integer>();

    for (int i = 0; Math.pow(2, i) < 4096 + 1; i++) {
      powers.add((int) Math.pow(2, i));
    }
    return powers;
  }

  public static void main(String[] args) {
    System.out.println(getOdds());
    System.out.println(getEvens());
    System.out.println(getPowersOfTwo());
  }
}
