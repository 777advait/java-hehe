package gui;

import javax.swing.*;
import java.awt.FlowLayout;

public class Table extends JFrame {
  Table() {
    String[] header = {"id", "name", "age"};
    Object[][] rows = {
      {1, "Advait", 17},
      {2, "John", 28},
      {3, "Jane", 14},
    };

    JTable table = new JTable(rows, header);

    pack();
    add(table);

    setSize(400, 400);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Table();
  }
}
