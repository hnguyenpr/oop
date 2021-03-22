package com.siu.edu.vn.chess;

import java.util.ArrayList;
import java.util.List;

public class Rook extends BasePiece implements Piece {

  public Rook(Square square, Side side) {
    super(square, side);
    if (this.side == Side.BLACK) {
      image = loadImage("/br.png");
    } else {
      image = loadImage("/wr.png");
    }
  }

  @Override
  public List<Square> getLegalMoves(Board board) {
    // TODO
    return new ArrayList<>();
  }
}
