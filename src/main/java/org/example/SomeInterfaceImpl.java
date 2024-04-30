package org.example;

import java.util.function.Supplier;

public class SomeInterfaceImpl implements SomeInterface {

  @Override
  public void someDummyMethod() {
    System.out.println("This is our implementation of someDummyMethod");
    // let's say we need a supplier which returns 5
    Supplier<Integer> returning5Supplier = new Supplier<Integer>() {
      @Override
      public Integer get() {
        return 5;
      }
    };
    // let's say we need a supplier object here which returns 10
    Supplier<Integer> returning10Supplier = new Returning10Supplier();
  }
}
