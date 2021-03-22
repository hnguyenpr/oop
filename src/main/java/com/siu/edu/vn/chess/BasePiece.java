package com.siu.edu.vn.chess;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;

public abstract class BasePiece implements Piece {

  Side side;
  Square square;
  BufferedImage image;

  public BasePiece(Square square, Side side) {
    this.square = square;
    this.side = side;
  }

  @Override
  public void move(Square newSquare) {
    square.removePiece();
    this.square = newSquare;
    this.square.setPiece(this);
  }

  public abstract List<Square> getLegalMoves(Board board);

  @Override
  public void show(Graphics g) {
    g.drawImage(image, square.getX(), square.getY(), square.getWidth(), square.getHeight(),
        null);
  }

  @Override
  public Square getPosition() {
    return square;
  }

  @Override
  public BufferedImage getImage() {
    return this.image;
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
