import java.util.Scanner;
public class Animals {
public static class Animal {
  String name;
  float weight;
  float height;
  String colour;
  public Animal(String name, float weight, float height, String colour) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.colour = colour;
  }

  public void eat() {
    System.out.println("Animal is eating");
  }
  public void sleep() {
    System.out.println("Animal is sleeping");
  }
  public void makeSound() {
    System.out.println("Animal make sound");
  }
}

public static class Cat extends Animal {
  public Cat(String name, float weight, float height, String colour) {
    super(name, weight, height, colour);
  } 
  @Override
  public void eat() {
    System.out.println("Cat is eating");
  }
  @Override
  public void sleep() {
    System.out.println("Cat is sleeping");
  }
  @Override
  public void makeSound() {
    System.out.println("Cat make sound");
  }
}

public static class Dog extends Animal {
  public Dog(String name, float weight, float height, String colour) {
    super(name, weight, height, colour);
  } 
  @Override
  public void eat() {
    System.out.println("Dog is eating");
  }
  @Override
  public void sleep() {
    System.out.println("Dog is sleeping");
  }
  @Override
  public void makeSound() {
    System.out.println("Dog make sound");
  }
}

public static class Cow extends Animal {
  public Cow(String name, float weight, float height, String colour) {
    super(name, weight, height, colour);
  }
  @Override
  public void eat() {
    System.out.println("Cow is eating");
  }
  @Override
  public void sleep() {
    System.out.println("Cow is sleeping");
  }
  @Override
  public void makeSound() {
    System.out.println("Cow make sound");
  }
}

  public static void main(String args[]) {
    //Animal[] animals = addAnimals();
    //Arrays.toString(animals);
    //for (Animal animal : animals) {
      //animal.eat();
    //}
    Animal animal = new Animal("Animal", 1, 1, "black");
    animal.eat();
    Dog dog = new Dog("Dog", 1, 1, "black");
    dog.sleep();
    Cat cat = new Cat("Cat", 1, 1, "black");
    cat.makeSound();
    //Cow cow; // do nothing
  }
}
