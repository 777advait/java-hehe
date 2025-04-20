package gui;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class DepartmentRadio extends JFrame {
  DepartmentRadio() {
    

    JRadioButton co = new JRadioButton("Computer Engineering");
    JRadioButton it = new JRadioButton("Information Technology");
    JRadioButton ej = new JRadioButton("Electronics");

    ButtonGroup bg = new ButtonGroup();

    bg.add(ej);
    bg.add(it);
    bg.add(co);

    add(co);
    add(it);
    add(ej);

    pack();

    setSize(300, 300);
    setVisible(true);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new DepartmentRadio();
  }
}
