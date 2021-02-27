package com.siu.edu.vn.chess;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel implements MouseListener, MouseMotionListener {

    private Square[][] squares;

    public Board() {
        setLayout(new GridLayout(8, 8, 0, 0));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setPreferredSize(new Dimension(400, 400));
        this.setMaximumSize(new Dimension(400, 400));
        this.setMinimumSize(this.getPreferredSize());
        this.setSize(new Dimension(400, 400));

        squares = new Square[8][8];
        for (int i=0; i < 8; i ++) {
            for (int j=0; j< 8; j ++) {
                int xMod = i % 2;
                int yMod = j % 2;
                if ((xMod == 0 && yMod == 0) || (xMod == 1 && yMod == 1)) {
                    squares[i][j] = new Square(0);
                } else {
                    squares[i][j] = new Square(1);
                }
                this.add(squares[i][j]);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        for (int i=0; i < 8; i ++) {
            for (int j=0; j< 8; j ++) {
                squares[i][j].paintComponent(g);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
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