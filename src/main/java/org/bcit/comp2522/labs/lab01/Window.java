package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * Program that creates a custom drawing in a separate window.
 *
 * @version 17.0.4.1
 *
 * @author hyukpk
 */

public class Window extends PApplet {

  public void settings() {
    size(500, 500);
  }

  /**
   * Draws shapes that resemble a snowman.
   */

  public void draw() {
    ellipse(249, 382, 360, 186);
    ellipse(264, 238, 265, 105);
    ellipse(273, 156, 213, 75);
    line(83, 120, 491, 116);
    quad(198, 117, 353, 117, 354, 29, 198, 29);
  }


  public void mousePressed() {
    background(64);
  }

  /**
   * Drives the program.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
