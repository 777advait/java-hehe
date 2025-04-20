package thread;

class EvenThread extends Thread {
  public void run() {
    for (int i  =0; i <= 20; i ++) {
      if (i % 2 == 0) System.out.println(i);
      try {
        sleep(1000);
      } catch (Exception e ) {
        System.out.println("Unexpected error occurred: " + e);
      }
    }
  }
}

class OddThread extends Thread {
  public void run() {
    for (int i  =0; i <= 20; i ++) {
      if (i % 2 != 0) System.out.println(i);
      try {
        sleep(1000);
      } catch (Exception e ) {
        System.out.println("Unexpected error occurred: " + e);
      }
    }
  }
}

public class EvenOddThread {
  public static void main(String[] args) {
    EvenThread et = new EvenThread();
    OddThread ot = new OddThread();

    et.start();
    ot.start();
  }
}
