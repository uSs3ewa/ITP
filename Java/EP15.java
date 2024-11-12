// interfaces are nouns, like objects
public class EP15 {
  // emty class that tell what methods must be implemented
  public static interface Drivable {
    // fields are constant
    double PI = 3.14;

    // public abstract by default
    int getWheel();

    void setWheels(int numWheels);

    double getSpeed();

    void setSpeed(double speed);
  }

  public static abstract class Crashable {
    boolean carDrivable = true;

    public void youCrashed() {
      this.carDrivable = false;
    }

    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();
  }

  // extends goes before implements
  public static class Vehicle extends Crashable implements Drivable {
    int numOfWheels = 2;
    double speed = 0;
    int carStrength = 0;

    // Grab all method and make them public
    public int getWheel() {
      return this.numOfWheels;
    }

    public void setWheels(int numWheels) {
      this.numOfWheels = numWheels;
    }

    public double getSpeed() {
      return this.speed;
    }

    public void setSpeed(double speed) {
      this.speed = speed;
    }

    public void setCarStrength(int carStrength) {
      this.carStrength = carStrength;
    }

    public int getCarStrength() {
      return carStrength;
    }

    public Vehicle(int wheels, double speed) {
      this.numOfWheels = wheels;
      this.speed = speed;
    }

    public Vehicle() {
    }
  }

  public static void main(String[] args) {
    Vehicle car = new Vehicle(4, 100);
    System.out.println("Wheels: " + car.getWheel() + ' ' + "Speed: " + car.getSpeed());
  }
}
