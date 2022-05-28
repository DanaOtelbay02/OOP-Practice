package Chapter13;

import java.awt.*;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
 private int area;
/** Construct a ComparableRectangle with specified properties */
 public ComparableRectangle(int width, int height) {
  super(width, height);
  area = width * height;
 }

 @Override // Implement the compareTo method defined in Comparable
 public int compareTo(ComparableRectangle o) {
  if (getArea() > o.getArea())
   return 1;
  else if (getArea() < o.getArea())
   return -1;
  else
   return 0;
 }

 private int getArea() {
  return area;
 }

 @Override // Implement the toString method in GeometricObject
  public String toString() {
   return super.toString() + " Area: " + getArea();
  }
}