package checkedvsunchecked;

// Unchecked exception: Java does not let you deal with these exceptions before compiling
// These exceptions can be dealt with either try catch or throws declaration
// Runtime exception and all of its subclasses are Unchecked Exceptions

public class UncheckedExceptionDemo {

  public static void main(String[] args) {
    String name = null;
    printLength(name);
  }

  private static void printLength(String myString) {
    try {
      System.out.println(myString.length());
    } catch (NullPointerException e) {
      System.out.println("String cannot be null");
    }
  }
}
