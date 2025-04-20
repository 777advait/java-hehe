package copyconst;

class TestClass {
  int a;

  TestClass(int a) {
    this.a = a;
  }

  TestClass(TestClass t) {
    this.a = t.a;
  }

  void show() {
    System.out.println(a);
  }
}


public class CopyConst {
  public static void main(String[] args) {
    TestClass obj1 = new TestClass(0);
    TestClass obj2 = new TestClass(obj1);

    obj1.show();
    obj2.show();
  }  
}
