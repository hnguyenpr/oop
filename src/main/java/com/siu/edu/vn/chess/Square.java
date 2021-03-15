package com.siu.edu.vn.chess;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Square extends JComponent {
  private Piece piece;
  protected Color color;

  public void setPiece(Piece piece) {
    this.piece = piece;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(color);
    g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    piece.show(g);
  }
}
