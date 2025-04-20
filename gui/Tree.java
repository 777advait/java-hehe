package gui;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.FlowLayout;

public class Tree extends JFrame {
  Tree() {
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
    DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("node1");
    DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("node2");
    DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("node3");

    root.add(node1);
    root.add(node2);
    root.add(node3);

    JTree tree = new JTree(root);

    pack();

    add(tree);

    setSize(400, 400);
    setLayout(new FlowLayout());
    setVisible(true);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }  

  public static void main(String[] args) {
    new Tree();
  }
}
