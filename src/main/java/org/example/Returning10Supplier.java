package org.example;

import java.util.function.Supplier;

// named implementation of Supplier interface, can be reused
public class Returning10Supplier implements Supplier<Integer> {

  @Override
  public Integer get() {
    return 10;
  }
}
