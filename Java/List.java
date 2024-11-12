import java.util.ArrayList;
public class List {
  public static void main(String[] args) {
    String[] fruits = new String[3];
    for (int i=0; i<fruits.length; i++) {
      fruits[i] = "fruit " + i; //String.valueOf(i);
    }
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    ArrayList<String> fruitList = new ArrayList<>();
    fruitList.add("fruit");
    for (var fruit : fruitList) {
      System.out.println(fruit);
    }
    fruitList.clear();
    System.out.println(fruitList);
  }
}
