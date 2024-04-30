package org.example;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

  private static Predicate<Integer> isPositivePredicate = new Predicate<Integer>() {
    @Override
    public boolean test(Integer integer) {
      return integer > 0;
    }
  };

  public static void main(String[] args) {

    // anonymous implementation of Supplier interface, can't be reused
    Supplier<Integer> returning5Supplier = new Supplier<Integer>() {
      @Override
      public Integer get() {
        return 5;
      }
    };
    System.out.println(returning5Supplier.get());

    Supplier<Integer> returning10Supplier = new Returning10Supplier();
    printSum(returning5Supplier, returning10Supplier);

    Consumer<String> printStringConsumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println("Printing in the consumer: " + s);
      }
    };
    printStringConsumer.accept("This will be printed");

    BiConsumer<Integer, Integer> multiplyIntegersBiConsumer = new BiConsumer<Integer, Integer>() {
      @Override
      public void accept(Integer integer, Integer integer2) {
        System.out.printf("%s * %s = %s%n", integer, integer2, integer * integer2);
      }
    };
    multiplyIntegersBiConsumer.accept(5, 10);

    System.out.println("5 is positive: " + isPositivePredicate.test(5));
    System.out.println("-10 is positive: " + isPositivePredicate.test(-10));

    Function<String, Integer> stringLengthFunction = getStringLengthFunction();
    String hello = "Hello World";
    System.out.printf("The length of '%s' string is: %d%n", hello, stringLengthFunction.apply(hello));

    // unary operator, when we need function with same input and output type
    // instead of doint this:
    Function<Integer, Integer> multiplyBy2Function = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer integer) {
        return integer * 2;
      }
    };
    System.out.println("10 * 2 = " + multiplyBy2Function.apply(10));

    // we can do this:
    UnaryOperator<Integer> multiplyBy2Operator = new UnaryOperator<Integer>() {
      @Override
      public Integer apply(Integer integer) {
        return integer * 2;
      }
    };
    System.out.println("10 * 2 = " + multiplyBy2Operator.apply(10));


  }

  // functional programming is about being able to send a 'functionality' to the method or return from it
  // java.util.function interfaces are kind of containers for some common functionality
  private static void printSum(Supplier<Integer> firstNumber, Supplier<Integer> secondNumber) {
    System.out.printf("%s + %s = %s%n", firstNumber.get(), secondNumber.get(), firstNumber.get() + secondNumber.get());
  }

  private static Function<String, Integer> getStringLengthFunction() {
    return new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return s.length();
      }
    };
  }
}