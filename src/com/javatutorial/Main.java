package com.javatutorial;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    // Primitive types that were actually going to use, they are independent of each other
    byte age = 30; // Good up to number 127
    int number = 150_000; // Good upt to number 2 billion, takes more memory
    long viewsCount = 3_123_456_789L; // You have to reference if it's a long using an L at the end, Java will think it's an integer
    float price = 10.99F; // Same as before, but Java will think everything with a decimal is a double, so you type an F at the end
    char letter = 'A'; // char is 1 legcapi.dlltter and single quotes, string is more than one letter and double quotes
    boolean isEligible = false;

    //References to classes, intellisense import just as it does for typescript
    Date now = new Date();
    System.out.println(now);
  }
}
