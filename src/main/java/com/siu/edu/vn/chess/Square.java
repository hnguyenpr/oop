package com.siu.edu.vn.chess;

import java.awt.Color;
import java.awt.Graphics;
import javax.annotation.Nullable;
import javax.swing.JComponent;

public class Square extends JComponent {

  private Piece piece;
  private boolean displayingPiece;
  protected Color color;

  public void setPiece(Piece piece) {
    this.piece = piece;
  }

  public void removePiece() {
    this.piece = null;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(color);
    g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    if (getOccupyingPiece() != null && displayingPiece) {
      getOccupyingPiece().show(g);
    }
  }

  public boolean isOccupied() {
    return (this.piece != null);
  }

  @Nullable
  public Piece getOccupyingPiece() {
    return piece;
  }

  public void setDisplayPiece(boolean v) {
    this.displayingPiece = v;
  }

}
