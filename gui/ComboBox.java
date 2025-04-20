package gui;

import javax.swing.*;
import java.awt.FlowLayout;

public class ComboBox extends JFrame {
  ComboBox() {
    String[] colors = {"red", "green", "blue"};
    JComboBox<String> comboBox = new JComboBox<>(colors);

    pack();

    add(comboBox);

    setSize(400, 400 );
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new ComboBox();
  }
}
