package gui;

import javax.swing.*;
import java.awt.FlowLayout;

public class List extends JFrame {
  List() {
    String[] cities = {"mumbai", "panjim", "hyderabad", "bengaluru", "pune", "mumbai", "panjim", "hyderabad", "bengaluru", "pune", "mumbai", "panjim", "hyderabad", "bengaluru", "pune"};

    JList<String> list = new JList<>(cities);
    JScrollPane scrollPane = new JScrollPane(list);
    pack();
    add(scrollPane);

    setSize(400, 400);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
  public static void main(String[] args) {
    new List();
  }
}
