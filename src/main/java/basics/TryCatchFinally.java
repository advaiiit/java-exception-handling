package basics;

// You can handle multiple types of expressions in a single catch block
// Even if you use return statement in you try block, finally block will still be executed;

public class TryCatchFinally {

  public static void main(String[] args) {
    try {
      int myInt = Integer.parseInt("Hello");
      System.out.println("Found an integer: " + myInt);
      return;
    } catch (NumberFormatException | NullPointerException e) {
      System.out.println("Could not find any integer");
    } finally {
      System.out.println("Use this integer: 100");
    }
  }
}