package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calcurate = new Calculate();
    int expected = 5;
    assertEquals(expected, calcurate.sum(2, 3));
  }
}