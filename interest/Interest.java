package interest;

interface IInterest {
  static final float rate = 25;

  public void simple_interest(float principle, float time);
  public void compound_interest(float principle, float time);
}

public class Interest implements IInterest {
  public void simple_interest(float principle, float time) {
    float si = (principle * time * rate) / 100;
    System.out.println("Simple interest: " + si);
  }
  
  public void compound_interest(float principle, float time) {
    double ci = principle * Math.pow((1 + rate/ 100), time) - principle;

    System.out.println("Compound Interest: " + ci);
  }

  public static void main(String[] args) {
    Interest i = new Interest();

    i.simple_interest(1000, 2);
    i.compound_interest(1000, 2);
  }
}
