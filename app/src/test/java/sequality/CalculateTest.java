package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testsum() {
    Calculate calcurate = new Calculate();
    int expected = 5;
    assertEquals(expected, calcurate.sum(2, 3));
  }

  @Test
  public void testave() {
    Calculate calcurate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calcurate.ave(2, 3), 0.0001);
  }

  @Test
  public void testsumall() {
    Calculate calcurate = new Calculate();
    int expected = 55;
    assertEquals(expected, calcurate.sumall(1, 10));
  }

  @Test
  public void testaveall() {
    Calculate calcurate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calcurate.aveall(1, 10), 0.0001);
  }

  @Test
  public void testodd() {
    Calculate calcurate = new Calculate();
    int expected = 25;
    assertEquals(expected, calcurate.odd(1, 10));
  }

  @Test
  public void testeven() {
    Calculate calcurate = new Calculate();
    int expected = 30;
    assertEquals(expected, calcurate.even(1, 10));
  }
}
