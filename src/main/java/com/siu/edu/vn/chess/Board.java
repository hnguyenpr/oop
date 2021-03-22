package com.siu.edu.vn.chess;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel implements MouseListener, MouseMotionListener {

  private Square[][] squares;

  private Piece currPiece;
  private int currX;
  private int currY;

  public Board() {
    setLayout(new GridLayout(8, 8, 0, 0));
    this.addMouseListener(this);
    this.addMouseMotionListener(this);
    this.setPreferredSize(new Dimension(400, 400));
    this.setMaximumSize(new Dimension(400, 400));
    this.setMinimumSize(this.getPreferredSize());
    this.setSize(new Dimension(400, 400));

    squares = new Square[8][8];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        int xMod = i % 2;
        int yMod = j % 2;
        if ((xMod == 0 && yMod == 0) || (xMod == 1 && yMod == 1)) {
          squares[i][j] = new BlackSquare();
        } else {
          squares[i][j] = new WhiteSquare();
        }
        this.add(squares[i][j]);
      }
    }
    squares[0][0].setPiece(new Rook(squares[0][0], Side.BLACK));
    squares[0][0].setDisplayPiece(true);
  }

  @Override
  public void paintComponent(Graphics g) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        squares[i][j].paintComponent(g);
      }
    }
    if (currPiece != null) {
      g.drawImage(currPiece.getImage(), currX, currY, currPiece.getPosition().getWidth(),
          currPiece.getPosition().getHeight(), null);
    }
  }

  @Override
  public void mousePressed(MouseEvent e) {
    currX = e.getX();
    currY = e.getY();

    Square sq = (Square) this.getComponentAt(new Point(e.getX(), e.getY()));

    if (sq.isOccupied()) {
      currPiece = sq.getOccupyingPiece();
      sq.setDisplayPiece(false);
    }
    repaint();
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    Square sq = (Square) this.getComponentAt(new Point(e.getX(), e.getY()));

    if (currPiece != null) {
      List<Square> legalMoves = currPiece.getLegalMoves(this);
      if (legalMoves.contains(sq)) {
        sq.setDisplayPiece(true);
        currPiece.move(sq);
        currPiece = null;
      } else {
        currPiece.getPosition().setDisplayPiece(true);
        currPiece = null;
      }
    }
    repaint();
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    currX = e.getX() - 24;
    currY = e.getY() - 24;
    repaint();
  }

  @Override
  public void mouseMoved(MouseEvent e) {
  }

  @Override
  public void mouseClicked(MouseEvent e) {
  }

  @Override
  public void mouseEntered(MouseEvent e) {
  }

  @Override
  public void mouseExited(MouseEvent e) {
  }

}