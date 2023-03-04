public class Point3D implements Comparable<Point3D> {
  final float x;
  final float y;
  final float z;

  public Point3D(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public int compareTo(Point3D o) {
    // TODO implement this method
    if (this.x > o.x) {
      return 1;
    } else if (this.x < o.x) {
      return -1;
    } else if (this.y > o.y) {
      return 1;
    } else if (this.y < o.y) {
      return -1;
    } else if (this.z > o.z) {
      return 1;
    } else if (this.z < o.z) {
      return -1;
    } else {
      return 0;
    }
  }
}
