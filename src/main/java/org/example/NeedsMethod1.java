package org.example;

public class NeedsMethod1 implements NonFunctionalInterface {

  @Override
  public void method1() {
    System.out.println("method1 implementation");
  }

  @Override
  public void method2() {
    // don't need this method
  }

  @Override
  public void method3() {
    // don't need this method
  }
}
