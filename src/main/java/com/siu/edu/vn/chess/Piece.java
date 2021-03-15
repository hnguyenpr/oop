package com.siu.edu.vn.chess;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;

public abstract class Piece {

  Side side;
  Square square;
  BufferedImage image;

  public Piece(Square square, Side side) {
    this.square = square;
    this.side = side;
  }

  public void move(Square square) {
    // TODO
  }

  public abstract List<Square> getLegalMoves();

  public void show(Graphics g) {
    g.drawImage(image, square.getX(), square.getY(), square.getWidth(), square.getHeight(),
        null);
  }

  BufferedImage loadImage(String imgFile) {
    try {
      return ImageIO.read(getClass().getResource(imgFile));
    } catch (IOException ex) {
      System.out.println("Exception " + ex.getMessage());
      throw new RuntimeException(ex);
    }
  }
}
