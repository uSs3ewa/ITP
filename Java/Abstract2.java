
public class AbstractExample { // Renamed to avoid confusion with Java's Abstract keyword

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

    // Human class extending Creature
    public class Human extends Creature {
        @Override
        public void born(String name) { // Correctly matches superclass method
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

    // Dog class extending Creature
    public class Dog extends Creature {
        @Override
        public void born(String name) { // Added parameter to match superclass method
            setName(name); // Use the provided name
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

    // Alien class extending Creature
    public class Alien extends Creature {
        @Override
        public void born(String name) { // Added parameter to match superclass method
            setName(name); // Use the provided name
            this.isAlive = true;
            System.out.println("The Alien " + this.name + " was born");
        }
  
        @Override
        public void die() {
            System.out.println("The Alien " + this.name + " has died");
            this.isAlive = false;
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        AbstractExample example = new AbstractExample(); // Create an instance of AbstractExample
        
        Dog dog = example.new Dog(); // Create an instance of Dog using the outer class instance
        dog.born("myDog"); // Pass a name as an argument
        dog.die();

        Human human = example.new Human(); // Create an instance of Human using the outer class instance
        human.born("myHuman"); // Pass a name as an argument
        human.die();

        Alien alien = example.new Alien(); // Create an instance of Alien using the outer class instance
        alien.born("myAlien"); // Pass a name as an argument
        alien.die();
    }
}
