public class Person implements Comparable<Person> {

  final String firstName;
  final String lastName;

  public Person(String firstName, String lastName) {
    // Note - this is not particularly relevant to this assignment, but this is
    // not the best way to store peoples' names.  Every programmer should read
    // this:
    // https://www.kalzumeus.com/2010/06/17/falsehoods-programmers-believe-about-names/
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public int compareTo(Person o) {
    // TODO implement this method
    if (this.lastName.compareTo(o.lastName) > 0) {
      return 1;
    } else if (this.lastName.compareTo(o.lastName) < 0) {
      return -1;
    } else if (this.firstName.compareTo(o.firstName) > 0) {
      return 1;
    } else if (this.firstName.compareTo(o.firstName) < 0) {
      return -1;
    } else {
      return 0;
    }
  }
}
