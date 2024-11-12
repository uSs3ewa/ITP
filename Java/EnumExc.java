import java.util.Scanner;

// inherit abstraction
// implement interface

public class EnumExc {
  public enum Drink {
    COLA("Coca Cola", 10),
    SPRITE("Sprite", 8),
    FANTA("Fanta", 6);

    private final int price;
    private final String name;

    Drink(String name, int price) {
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public int getPrice() {
      return price;
    }

    public int getDrink(int myMoney) {
      return moneyBack = price - myMoney;
      if (myMoney < price) {
        System.out.println("Not enough money");
      }
      return myMoney - price;
    }
  }

  public enum Money {
    ONE(1),
    FIVE(5),
    TEN(10);

    private final int denomination;

    Money(int denomination) {
      this.denomination = denomination;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Drink cola = new Drink(scan.next(), scan.nextInt());
    Drink sprite = new Drink(scan.next(), scan.nextInt());
    Drink fanta = new Drink(scan.next(), scan.nextInt());

  }
}
