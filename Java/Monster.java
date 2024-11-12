public class Monster {

  public final String TOMBSTONE = "Here Lies a Dead monster";

  private int health = 500;
  private int attack = 20;
  private int movement = 2;
  private int xPosition = 0;
  private int yPosition = 0;
  private boolean alive = true;

  public String name = "Big Monster";

  public int getAttack() {
    return this.attack;
  }

  public int gethealth() {
    return this.health;
  }

  public int getMovement() {
    return this.movement;
  }

  public void setHealth(int damage) {
    this.health = this.health - damage;
    if (health <= 0) {
      this.alive = false;
    }
  }

  // Overloading
  public void setHealth(double damage) {
    this.health = this.health - (int) damage;
    if (health <= 0) {
      this.alive = false;
    }
  }

  public Monster(int health, int attack, int movement, String name) {
    this.health = health;
    this.movement = movement;
    this.attack = attack;
    this.name = name;
  }

  // Default constructor == Do not create

  public static void main(String[] args) {

  }
}
