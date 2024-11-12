// Animals
public class EP14 {
  // Superclass - means you make
  public static class Animal {

    private String name = "Animal";
    public String favFood = "Food";

    protected final void setName(String name) {
      this.name = name;
    }

    // final means we cant change it from any subclasses
    protected String getName() {
      return name;
    }

    public void eat() {
      System.out.println("Yum " + favFood);
    }

    public void walk() {
      System.out.println(name + " walking");
    }

    public Animal(String name, String favFood) {
      this.setName(name);
      this.favFood = favFood;
    }

    public Animal() {
    }
  }

  public static class Cat extends Animal {
    public String favToy = "Yarn";

    public void playWith() {
      System.out.println("Yeah " + favToy);
    }

    // final you cannot override
    public void walk() {
      System.out.println(this.getName() + "stalks around");
    }

    public Cat(String name, String favFood, String favToy) {
      this.setName(name);
      this.favFood = favFood;
      this.favToy = favToy;
    }

  }

  public static void main(String[] args) {
    Animal animal = new Animal();
    System.out.println(animal.getName() + animal.favFood);

    Cat cat = new Cat("Morris", "Tuna", "Mouse");
    System.out.println(cat.getName() + ' ' + cat.favFood + ' ' + cat.favToy);

    // Animal tabby = new Cat("Tabby", "Salmon", "Ball");
    System.out.println(cat instanceof Cat);
  }
}
