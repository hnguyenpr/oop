package com.siu.edu.vn.chess;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.List;

public interface Piece {
   Square getPosition();
   void move(Square square);
   BufferedImage getImage();
   void show(Graphics g);
   List<Square> getLegalMoves(Board board);
}
