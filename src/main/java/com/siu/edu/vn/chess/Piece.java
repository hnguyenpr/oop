package com.siu.edu.vn.chess;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

  Side side;
  Square square;

  public Piece() {}
  public Piece(Square square, Side side) {
    this.square = square;
    this.side = side;
  }

  public void move(Square square) {
    // TODO
  }

  public abstract List<Square> getLegalMoves();

  public abstract BufferedImage getImage();

  public void show(Graphics g) {
    g.drawImage(getImage(), square.getX(), square.getY(), square.getWidth(), square.getHeight(),
        null);
  }
}
