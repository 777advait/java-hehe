package gui;

import javax.swing.*;
import java.awt.FlowLayout;

public class ColorRadio extends JFrame {
  ColorRadio() {
    JRadioButton red = new JRadioButton("red");
    JRadioButton green = new JRadioButton("green");
    JRadioButton blue = new JRadioButton("blue");

    ButtonGroup bg = new ButtonGroup();
    bg.add(red);
    bg.add(green);
    bg.add(blue);

    pack();

    add(red);
    add(green);
    add(blue);

    setSize(600, 600);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new ColorRadio();
  }
}
