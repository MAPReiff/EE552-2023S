import java.io.Serializable;

public class Album implements Serializable {
  private String title;
  private int year;
  private String label;

  public Album(String title, int year, String label) {
    this.title = title;
    this.year = year;
    this.label = label;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}