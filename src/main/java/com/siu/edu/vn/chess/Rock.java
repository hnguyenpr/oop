package com.siu.edu.vn.chess;

import java.util.ArrayList;
import java.util.List;

public class Rock extends Piece {

  public Rock(Square square, Side side) {
    super(square, side);
    if (this.side == Side.BLACK) {
      image = loadImage("/br.png");
    } else {
      image = loadImage("/wr.png");
    }
  }

  public List<Square> getLegalMoves() {
    // TODO
    return new ArrayList<>();
  }
}
