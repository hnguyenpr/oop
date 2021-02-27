package com.siu.edu.vn.chess;

import javax.swing.*;

public class App implements Runnable {

  public void run() {
    SwingUtilities.invokeLater(new GameWindow());
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new App());
  }
}
