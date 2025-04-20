package armstrong;

public class Armstrong {
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i ++) {
      int n = i, sum = 0;

      while (n > 0) {
        int digit = n% 10;
        sum += digit * digit * digit;
        n /= 10;
      }

      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}
