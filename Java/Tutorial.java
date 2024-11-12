import java.util.Scanner;

public class Tutorial {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    String cont = "Y";
    int cnt = 1;
    while (cont.equalsIgnoreCase("y")) {
      System.out.println(cnt);
      System.out.println("Continue y or n? ");
      cont = userInput.nextLine();
      cnt++;
    }

    byte bigByte = 1;
    short bigShort = 2;
    String byteStr = Byte.toString(bigByte);
    String shortStr = Short.toString(bigShort);
    System.out.println(byteStr);
    System.out.println(shortStr);

    int newInt = Integer.parseInt(shortStr);
    System.out.println(newInt);

    int number = Math.abs(-2);
    System.out.println(number);

    int numCeil = (int) Math.ceil(5.23); // 6
    int numFloor = (int) Math.floor(5.23); // 5
    int numRound = (int) Math.round(5.63); // 6

    int rand = (int) (Math.random() * 10); // between 0 and numver that will not show up
    System.out.println(rand);

    // Ternary operator
    int numOne = 1, numTwo = 2;
    int biggestValue = (numOne > numTwo) ? numOne : numTwo;
    System.out.println(biggestValue);

    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("Great job");
        break;
      case 'B':
        System.out.println("Good job");
        break;
      case 'C':
        System.out.println("Ok");
        break;
      case 'D':
        System.out.println("Bad");
        break;
      default:
        System.out.println("Fail");
        break;
    }

    double myPi = 4.0;
    double j = 3.0;
    while (j < 1000) {
      myPi = myPi - (4 / j) + (4 / (j + 2));
      j += 4;
      System.out.println(myPi);
    }
    System.out.println("Value of Pi: " + Math.PI);
  }
}
