import java.util.HashSet;
import java.util.Set;

public class AppleBasket implements Comparable<AppleBasket> {
  Set<Apple> apples = new HashSet<>();

  public AppleBasket addApple() {
    apples.add(new Apple());
    return this;
  }

  @Override
  public int compareTo(AppleBasket o) {
    // TODO implement this method
    if (this.apples.size() > o.apples.size()) {
      return 1;
    } else if (this.apples.size() < o.apples.size()) {
      return -1;
    } else {
      return 0;
    }
  }

  public static class Apple {}
}
