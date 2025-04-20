package gui;

import javax.swing.*;
import java.awt.FlowLayout;

public class ProgressBar extends JFrame {
  ProgressBar() {
    JProgressBar pg = new JProgressBar(0, 100);
    pg.setValue(75);
    pg.setStringPainted(true);

    add(pg);

    pack();

    setSize(500, 500);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new ProgressBar();
  }
}
