package reverse;

import java.util.Scanner;

public class Reverse {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter the number to be reversed: ");
    int num = sc.nextInt(), rev = 0;

    while (num != 0) {
      rev = rev * 10 + num % 10;
      num /= 10;
    }

    System.out.println("Reversed number: " + rev);
  }
}
