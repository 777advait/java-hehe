package hierarchy;

class Animal {
  void sound() {
    System.out.println("The animal made a sound");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("woof woof mf");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("meow meow nigga");
  }
}

public class HierarchicalInheritance {
  public static void main(String[] args) {
    Dog d = new Dog();
    Cat  c = new Cat();

    d.sound();
    d.bark();
    c.sound();
    c.meow();
  }
}
