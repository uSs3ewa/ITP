public class AbstractExample { // Outer class

    // Abstract class - parent class that must be overridden
    public abstract class Creature {
        protected String name = null;
        protected boolean isAlive = false;

        public abstract void born(String name); // Method now accepts a name parameter

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

    // Animal class extending Creature
    public abstract class Animal extends Creature {
        // Additional properties or methods specific to animals can be added here
    }

    // Dog class extending Animal and declared as final
    public final class Dog extends Animal {
        @Override
        public void born(String name) { // Implementing the abstract method
            this.isAlive = true;
            setName(name);
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

    // Human class extending Animal and declared as final
    public final class Human extends Animal {
        @Override
        public void born(String name) { // Implementing the abstract method
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

    // Main method to execute the program
    public static void main(String[] args) {
        AbstractExample example = new AbstractExample(); // Create an instance of AbstractExample
        Dog dog = example.new Dog();
        Human human = example.new Human();
        Creature[] creatures = new Creature[] { dog, human }; 

        for (Creature creature : creatures) {
          creature.born("Name");
          creature.die();
        }
    }
}

