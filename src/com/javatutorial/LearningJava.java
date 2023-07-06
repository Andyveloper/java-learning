package com.javatutorial;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class LearningJava {
  public static void main(String[] args) {
    // Primitive types that were actually going to use, they are independent of each
    // other
    byte age = 30; // Good up to number 127
    int number = 150_000; // Good upt to number 2 billion, takes more memory
    long viewsCount = 3_123_456_789L; // You have to reference if it's a long using an L at the end, Java will think
    // it's an integer
    float price = 10.99F; // Same as before, but Java will think everything w
    // ith a decimal is a double, so
    // you type an F at the end
    char letter = 'A'; // char is 1 letter and single quotes, string is more than one letter and double
    // quotes
    boolean isEligible = false;

    // References to classes, intellisense import just as it does for typescript,
    // but you can change their assigned values
    Date now = new Date();
    Point point1 = new Point(1, 1);
    Point point2 = point1;
    point1.x = 2;

    System.out.println("Points:" + " " + point2);

    // Strings
    String message = "Hello World";
    System.out.println(message.length());

    // Arrays: If you want to create an array in Java, you have to set the type and
    // "[]" in front of it, and the elements of the array inside CURLY BRACES
    // like wtf I know, but it is what it is
    int[] numbers = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(numbers));

    // Constants, instead of using "const" like in JavaScript, you use the keyword "final" and name the constant in MAYUS
    final float PI = 3.14F;

    // Arithmetic expressions
    // This is to be able to use integer numbers, no decimals
    int resultInt = 10 + 3;
    System.out.println("arithmetic expressions integer: " + resultInt);

    // If you want to use decimals, then you have to add parenthesis like this
    double resultDec = (double)10 / (double)3;
    System.out.println("arithmetic expressions float: " + resultDec);

    // If you want to increment the value of a variable, you can do it as you do in JavaScript, using the increment
    // operator "++" as in x=1, x++, or the x+=1
    int x = 0;
    for (int i = 0; i < 5; i++) {
      x++;
      System.out.println(x);
    }


    // Casting and type conversions
    // Implicit Casting
    // byte > short > int > long > float > double
    short shortNumber = 1;
    int intNumber = shortNumber + 2;
    System.out.println("ImplicitCasting: " + intNumber);

    // Explicit Casting
    // We can decide the type change like this
    double doubleNumber = 1.1;
    int explicitIntNumber = (int)doubleNumber + 2;
    System.out.println("ExplicitCasting: " + explicitIntNumber);
    // Explicit casting only works with compatible types, numbers with numbers, strings with strings, etc. But we can change them (parsing) using classes
    String stringNumber = "1";

  }
}
