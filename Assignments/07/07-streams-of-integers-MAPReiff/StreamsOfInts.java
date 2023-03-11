import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOfInts {

  public static List<Integer> getOdds() {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      numbers.add(i);
    }

    List<Integer> odds =
        numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

    return odds;
  }

  public static List<Integer> getEvens() {
    // Write code here - use the **filter** method and produce a List<Integer>
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      numbers.add(i);
    }

    List<Integer> evens =
        numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

    return evens;
  }

  public static List<Integer> getPowersOfTwo() {
    // Write code here - use the **map** method and produce a List<Integer>
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 13; i++) {
      numbers.add(i);
    }

    List<Integer> powersOfTwo = numbers.stream()
                                    .map(n -> (int)Math.pow(2, n))
                                    .collect(Collectors.toList());

    return powersOfTwo;
  }

  public static void main(String[] args) {
    System.out.println(getOdds());
    System.out.println(getEvens());
    System.out.println(getPowersOfTwo());
  }
}
