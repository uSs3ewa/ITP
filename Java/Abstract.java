public class Abstract {
  // abstract class - parent class that must be ovveride

    // final class - last children of the class. it cannot be extend anymore
    // final vatiable - const
    
    // Interfaces - empty; declaration but not definition
    // can be implemented by non-subclasses
    //
    // interface and abstract class have no instances
    //
  public abstract class Creature {
    protected String name = null;
    protected boolean isAlive = false;

    public abstract void born(String name);

    public abstract void die();

    public void shoutName() {
      if (name != null) {
        System.out.println("shout " + this.name);
      }
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public class Human extends Creature {
    @Override
    public void born(String name) {
      this.isAlive = true;
      setName(name);
      System.out.println("The Human " + this.name + " was born");
    }
  
    @Override
    public void die() {
      System.out.println("The Human " + this.name + " has died");
      this.isAlive = false;
    }
  }

  public class Dog extends Creature {
    @Override
    public void born() {
      setName(name);
      this.isAlive = true;
      System.out.println("The Dog " + this.name + " was born");
    }
  
    @Override
    public void die() {
      System.out.println("The Dog " + this.name + " has died");
      this.isAlive = false;
    }

    public void bark() {
      System.out.println("barking");
    }
  }

  public class Alien extends Creature {
    @Override
    public void born() {
     setName(name);
      this.isAlive = true;
      System.out.println("The Alien " + this.name + " was born");
    }
  
    @Override
    public void die() {
      System.out.println("The Alien " + this.name + " has died");
      this.isAlive = false;
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.born("myDog");
    dog.die();

    Human human = new Human();
    human.born("myHuman");
    human.die();

    Alien alien = new Alien();
    alien.born("myAlien");
    alien.die();
  }
}
