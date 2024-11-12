import java.util.Arrays;
import java.util.LinkedList;

public class EP12 {
  public static void main(String[] args) {
    LinkedList linkList = new LinkedList(); // non-reStrictd
    LinkedList<String> names = new LinkedList<String>(); // strict

    names.add("Ahmed");
    names.add("Ali");
    names.addLast("Ethan");
    names.addFirst("Joshua");
    names.add(0, "Noah");
    names.set(2, "Paul");
    names.remove(4);
    names.remove("Ahmed");
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("First: " + names.get(0) + " Last: " + names.getLast());

    LinkedList nameCopy = new LinkedList<String>(names);
    System.out.println("Copy: " + nameCopy);
    System.out.println("Is Joshua" + names.contains("Joshua"));
    System.out.println("Is equal: " + names.containsAll(nameCopy));
    System.out.println("Ali at: " + names.indexOf("Ali"));
    System.out.println("Empty: " + names.isEmpty());
    System.out.println("Size: " + names.size());
    System.out.println("Look without Error " + names.peek()); // Is there first element
    System.out.println("Remove first: " + nameCopy.poll());
    System.out.println("Remove Last: " + nameCopy.pollLast());

    nameCopy.push("Noah"); // In at the beginning
    nameCopy.pop(); // Delete last

    Object[] nameArray = new Object[4];
    nameArray = names.toArray();
    names.clear();
  }
}
