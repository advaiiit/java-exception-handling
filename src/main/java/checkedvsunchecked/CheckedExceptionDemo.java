package checkedvsunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

// Checked Exception: Exceptions that Java makes you deal with at compile time. Java won't compile until you deal with it.
// Do deal with Checked Exceptions, you can either surround it with try catch block or put a throws declaration

public class CheckedExceptionDemo {

  public static void main(String[] args) {
    readFile1("myFile.txt");
    try {
      readFile2("myFile.txt");
    } catch (FileNotFoundException e) {
      System.out.println("File does not exists");
    }
  }

  private static void readFile1(String filename) {
    try {
      FileReader reader = new FileReader(filename);
    } catch (FileNotFoundException e) {
      System.out.println("Couldn't find the file");
    }
  }

  private static void readFile2(String filename) throws FileNotFoundException {
    FileReader reader = new FileReader(filename);
  }
}
