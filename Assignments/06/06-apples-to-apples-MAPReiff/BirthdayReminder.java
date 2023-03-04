public class BirthdayReminder implements Comparable<BirthdayReminder> {
  int month;
  int day;

  public BirthdayReminder(int month, int day) {
    this.month = month;
    this.day = day;
  }

  @Override
  public int compareTo(BirthdayReminder o) {
    // TODO implement this method
    // HINT for the sake of this comparison, assume that dates don't wrap around
    // when a new year starts

    if (this.month > o.month) {
      return 1;
    } else if (this.month < o.month) {
      return -1;
    } else if (this.day > o.day) {
      return 1;
    } else if (this.day < o.day) {
      return -1;
    } else {
      return 0;
    }
  }
}
