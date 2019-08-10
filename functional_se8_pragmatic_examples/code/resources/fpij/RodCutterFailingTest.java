/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package fpij;

import junit.framework.JUnit4TestAdapter;

public class RodCutterFailingTest extends RodCutterTest {
  protected RodCutter createCutter() {
    return new RodCutter(true);
  }
  
  public static void main(String[] args) {
    junit.textui.TestRunner.run(
    new JUnit4TestAdapter(RodCutterFailingTest.class));
  }
}
