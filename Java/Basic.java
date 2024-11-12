import java.util.Scanner;
public class Program {
  static int sum(int x, int y) { return x + y; }
  static double sum(double x, double y) { return x + y; }
  static int sum(int x, int y, int z) { return x + y + z; }

  static void sum(String message, int... nums) {

    System.out.println(message);
    int result = 0;
    boolean flag = false;
    for (int x : nums) {
      if (!flag)
        flag = true;
      result += x;
    }
    if (flag)
      System.out.println(result);
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // I/O practice
    /*
    System.out.println("Enter name: ");
    String name = scan.nextLine();
    System.out.println("Enter favorite food: ");
    // scan.nextLine();
    String food = scan.nextLine();
    */

    // Printf implementation
    /*
    System.out.print("Enter age: ");
    int age = scan.nextInt();
    System.out.println("Age with println: " + age);
    // other out of int:
    System.out.printf("Age with printf: %d \n", age);
    */

    // Print all inputs
    // System.out.println("Name: " + name + "\nAge: " + age + "\nFavorite food:
    // " + food);

    // Printf examle
    /*
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int num = in.nextInt();

    System.out.printf("Your number: %d \n", num);
    in.close();
    */

    // next() - Until space

    // d = 0.8(9)
    double d = 2.0 - 1.1;
    // System.out.println(d);

    // declaration
    int nums[] = new int[4];
    int[] arr = new int[5];

    // initialization = declare + assign
    int[] A = {1, 2, 3};
    int[] B = new int[] {1, 2, 3};
    for (int i : B) {
      System.out.println(i);
    }

    // multidimensional array
    // [0][1] == 2
    // [1][0] == 2
    int[][] twice = {{1, 2}, {2, 3}};
    /* for (int[] i : twice) {
      for (int j : i) {
        System.out.println(i);
      }
    }
    */

    for (int i = 0; i < twice.length; i++) {
      for (int j = 0; j < twice[i].length; j++) {
        System.out.printf("%d ", twice[i][j]);
      }
      System.out.println();
    }

    sum("Welcome!", 20, 10);
    sum("Hello World!");

    System.out.println(sum(2, 3));     // 5
    System.out.println(sum(4.5, 3.2)); // 7.7
    System.out.println(sum(4, 3, 7));  // 14

    // Error handilng
    /*
    try{
      int[] numbers = new int[3];
      numbers[4]=45;
      System.out.println(numbers[4]);
    }
    catch(Exception ex){
      ex.printStackTrace();
    }
    finally{
      System.out.println("Блок finally");
    }
    System.out.println("Программа завершена");
    */

    // Multiple error handling case
    int[] numbers = new int[3];
    try {
      System.out.println(8 / 0);
      numbers[6] = 45;
      numbers[6] = Integer.parseInt("gfd");
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      if (x >= 30) {
        throw new Exception("Число х должно быть меньше 30");
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Выход за пределы массива");
    } catch (NumberFormatException ex) {
      System.out.println("Ошибка преобразования из строки в число");
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
