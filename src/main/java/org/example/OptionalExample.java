package org.example;

import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {

    Optional<String> genderOptional = Optional.of("MALE");

    System.out.println("Gender optional object is: " + genderOptional);
    System.out.println("Gender is: " + genderOptional.get());

//    Optional<String> genderOptionalF = Optional.of(null); // should not be used like this, of with null
    Optional<String> genderOptional1 = Optional.ofNullable(null);
    if (genderOptional1.isPresent()) {
      System.out.println("Gender is: " + genderOptional1.get());
    }

    Optional<Integer> emptyIntegerOptional = Optional.empty();
    if (emptyIntegerOptional.isEmpty()) {
      System.out.println("There is no value inside of object");
    } else {
      System.out.println("Value in the object is: " + emptyIntegerOptional.get());
    }

//    System.out.println("The only way we can get NullPointerException, combining of method and null: " + Optional.of(null));
  }

}
