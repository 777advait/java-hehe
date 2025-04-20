package gui;

import javax.swing.*;
import java.awt.FlowLayout;

public class TabbedPane extends JFrame {
  TabbedPane() {
    JPanel p1 = new JPanel();
    p1.add(new JLabel("this is panel 1"));
    JPanel p2 = new JPanel();
    p2.add(new JLabel("this is panel 2"));
    JPanel p3 = new JPanel();
    p3.add(new JLabel("this is panel 3"));

    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.addTab("Tab 1", p1);
    tabbedPane.addTab("Tab 2", p2);
    tabbedPane.addTab("Tab 3", p3);

    pack();

    add(tabbedPane);

    setSize(400, 400);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new TabbedPane();
  }
}
