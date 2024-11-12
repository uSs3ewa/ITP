import java.util.Arrays;

public class EP13 {
  public static void main(String[] args) {
    String randStr = "My str";
    String gotToQuote = "He said \"I'm here\"";
    // \n \b \' \" \\ \r etc
    int num = 2;
    System.out.println(randStr + " " + gotToQuote + " " + num);
    String upper = "BIG";
    String lower = "big";
    System.out.println(upper.equals(lower));
    System.out.println(upper.equalsIgnoreCase(lower));

    String letters = "ajsix";
    String more = "ieueiscxlq";
    System.out.println("Second letter: " + letters.charAt(1));
    System.out.println(letters.compareTo(more)); // Before -> negative; After -> Positive
    System.out.println(
        letters.contains("aj") + " " + letters.endsWith("six") + " " + letters.indexOf("js") + " " + letters.length());

    // indexOf(stringToLook, startIndex)
    // lastIndexOf() - search from end

    System.out.println((letters.replace("six", "sex")));

    String[] letterArray = letters.split(""); // () use regex; e.g.: a,b,c->[a b c]
    System.out.println(Arrays.toString(letterArray)); // if first element is null -> use letters.toCharArray
    // toLower/UpperCase, substring, trim - remove white space
    // Strings is immutable; Every time it creates new it in new location in memory;
    // Time Consuming -> use StringBuilder
    StringBuilder randSB = new StringBuilder("A rand value");
    System.out.println(randSB.append(" again"));
    // Makes permanent change
    System.out.println(randSB);
    System.out.println(randSB.delete(15, 21));
    System.out.println(randSB.capacity());
    randSB.ensureCapacity(60); // new spaced used, at least new size

    randSB.trimToSize(); // ensure your capacity == size
    randSB.insert(1, "nother");
    String oldSB = randSB.toString();
    // charAt, indexOf, lastIndexOf, substring
  }
}
