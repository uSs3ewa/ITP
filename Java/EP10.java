import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class EP10 {
  public static void main(String[] args) {
    ArrayList arrList = new ArrayList();

    ArrayList<String> names = new ArrayList();
    names.add("John");
    names.add("John");
    names.add("John");
    names.add(1, "Oliver");
    names.set(0, "Jack");
    names.remove(2);

    System.out.println("\nFor Loop:");
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    System.out.println("\nPrintln:");
    // names.removeRange(0,2);
    System.out.println(names);
    System.out.println("\nForEach Loop:");

    // Before enhanced for loop came arounf - You had to use Iterators
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("\nInterator:");
    Iterator indivItems = names.iterator();
    while (indivItems.hasNext()) {
      System.out.println(indivItems.next());
    }

    ArrayList nameCopy = new ArrayList();
    nameCopy.addAll(names);

    String paulYoung = "Paul Young";
    names.add(paulYoung);
    if (names.contains(paulYoung)) {
      System.out.println("Paul is here");
    }
    System.out.println(names.containsAll(nameCopy));
    System.out.println(nameCopy.containsAll(names));

    names.clear();

    Object[] moreNames = new Object[4];
    moreNames = nameCopy.toArray();
  }
}
