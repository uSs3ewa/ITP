import java.util.Arrays;

public class EP9 {

  public static void main(String[] args) {
    int[] myArray;
    int[] numArray = new int[10];
    myArray = new int[20];
    myArray[0] = 2;
    String[] strArr = { "let", "'s", " go" };

    for (int i = 0; i < strArr.length; i++) {
      System.out.print(strArr[i]);
    }
    System.out.println();
    for (String str : strArr) {
      System.out.print(str);
    }
    System.out.println();

    String[][] multiArr = new String[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        multiArr[i][j] = i + " " + j;
      }
    }
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print("| " + multiArr[i][j] + " ");
      }
      System.out.println("|");
    }
    System.out.println();

    for (String[] rows : multiArr) {
      for (String col : rows) {
        System.out.print("| " + col + " ");
      }
      System.out.println("|");
    }

    int[] arrCopy = Arrays.copyOf(myArray, 5);

    int[] secondCopy = Arrays.copyOfRange(myArray, 3, 6);
    System.out.println(Arrays.toString(arrCopy));
    System.out.println(Arrays.toString(secondCopy));
    Arrays.fill(secondCopy, 2);
    System.out.println(Arrays.toString(secondCopy));

    int[] randArr = new int[10];
    for (int i = 0; i < 10; i++) {
      randArr[i] = (int) (Math.random() * 100);
    }
    System.out.println(Arrays.toString(randArr));
    Arrays.sort(randArr);
    System.out.println(Arrays.toString(randArr));

    // Find number - otherwise : negative
    System.out.println("There is 50: " + Arrays.binarySearch(randArr, 50));
  }
}
