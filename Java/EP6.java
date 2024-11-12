// java.lang.RunTimeException/Exception
// ArithmeticException; div by -
// ClassNotFoundExc
// IllegalArgumentExc
// InderOutOfBoundsExc
// InputMimatch; scan wrong datatype
// IOExc

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class EP6 {
  static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args) {
    int age = checkValidAge();
    System.out.println("Age:" + age);

    try {
      getAFile("./Age.java");
    } catch (IOException e) {
      System.out.println("IO Exception");
    }

    divideByZero(2);
  }

  public static int checkValidAge() {
    try {
      return userInput.nextInt();
    } catch (InputMismatchException e) {
      userInput.nextInt();
      System.out.println(e.getMessage());
      return 0;
    }
  }

  public static void getAFile(String fileName) throws IOException, FileNotFoundException {
    FileInputStream file = new FileInputStream(fileName);
  }

  public static void divideByZero(int x) {
    try {
      System.out.println(x / 0);
    } catch (ArithmeticException e) {
      System.out.println("Error arised");
      System.out.println(e.getMessage());
      System.out.println(e.toString());
      e.printStackTrace();
    }
  }
}
