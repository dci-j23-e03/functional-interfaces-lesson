package org.example;

// any interface which has single public abstract method is functional interface
@FunctionalInterface
public interface SomeInterface {

  // this method is by default public abstract
  void someDummyMethod();

  // if we want SomeInterface to be FunctionalInterface, we can have only single abstract method
  //void dummyMethod2();

}
