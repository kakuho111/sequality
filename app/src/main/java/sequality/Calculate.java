package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    double z = (double) (x + y) / 2;
    return z;
  }

  public int sumall(int x, int y) {
    int z = 0;
    for (int i = x; i <= y; i++) {
      z += i;
    }
    return z;
  }

  public double aveall(int x, int y) {
    double z = 0;
    int count = 0;
    for (int i = x; i <= y; i++) {
      z += i;
      count += 1;
    }
    return z / count;
  }

  public int odd(int x, int y) {
    int z = 0;
    for (int i = x; i <= 10; i++) {
      if (i % 2 == 1) {
        z += i;
      }
    }
    return z;
  }

  public int even(int x, int y) {
    int z = 0;
    for (int i = x; i <= 10; i++) {
      if (i % 2 == 0) {
        z += i;
      }
    }
    return z;
  }
}
