package com.siu.edu.vn.chess;

import static org.junit.Assert.assertEquals;

import com.google.common.primitives.Doubles;
import org.junit.Test;


public class TestApp {

  @Test
  public void testExample() throws Exception {
    App app = new App();
    assertEquals("should return 0 when both numbers are equal", 0, Doubles.compare(1, 1));
  }

}
