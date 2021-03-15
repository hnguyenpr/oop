package com.siu.edu.vn.chess;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class Rock extends Piece {

  private BufferedImage image;
  public Rock(Square square, Side side) {
    super(square, side);
    if (this.side == Side.BLACK) {
      try {
        this.image = ImageIO.read(getClass().getResource("/br.png"));
      } catch (IOException ex) {
        System.out.println("Exception " + ex.getMessage());
      }
    } else {
      try {
        this.image = ImageIO.read(getClass().getResource("/wr.png"));
      } catch (IOException ex) {
        System.out.println("Exception " + ex.getMessage());
      }
    }
  }

  public BufferedImage getImage() {
    return image;
  }

  public List<Square> getLegalMoves() {
    // TODO
    return new ArrayList<>();
  }


}
