package prime;

import java.util.Scanner;

public class Prime {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isPrime = true;
    int num = sc.nextInt();

    for (int i = 2; i <= num; i++) {
      if (num%i == 0) {
        isPrime = false;
        break;
      }
    }

    System.out.println(isPrime ? "Prime Number": "Not Prime Number");
  }
}
