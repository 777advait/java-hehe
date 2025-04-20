package vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorBrr {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    Vector<Object> vec = new Vector<>();

    vec.add("Hello");
    vec.add("World");
    vec.add(6);
    vec.add(9);
    vec.add(3.0f);
    vec.add(0.14f);

    System.out.println("Initial vector: " + vec);

    

    System.err.println("Enter the element to be removed");
    String el = sc.next();

    boolean removed = false;

    removed = vec.remove(el);

    if (!removed) {
      try {
        int intEl = Integer.parseInt(el);
        removed = vec.remove((Integer)intEl);
      } catch (NumberFormatException _) {}
    }

    if (!removed) {
      try {
        float floatVal  = Float.parseFloat(el);
        removed = vec.remove((Float)floatVal);
      } catch (NumberFormatException _) {}
    }

    if (removed) {
      System.out.println("Element removed successfully\nUpdated vector: " + vec);
    } else {
      System.out.println("Element wasn't removed!");
    }
  }
}
