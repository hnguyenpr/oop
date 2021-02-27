package com.siu.edu.vn.chess;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Square extends JComponent {
  private int color;

  public Square(int color) {
     this.color = color;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (this.color == 1) {
      g.setColor(new Color(255,255,255));
    } else {
      g.setColor(new Color(0, 0, 0));
    }
    g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
  }
}
