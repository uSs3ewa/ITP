// C - list of constant variables with names
//
// Java - 
/* The simplest one
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
*/

/* Advanced
 * public enum Level {
 *  HIGH {
 *    @Override
 *    public String asLowerCase() {
 *      return HIGH.toString().toLowerCase();
 *    }
 *  }
 * }
 */
public class Enums {
  public enum Level {
    LOW(3),
    MEDIUM(2),
    HIGH(1) // Through constructor
  }

  private final int levelCode;

  // Enum Constructor is used for every variable in this Enum
  Level(int levelCode) {
      this.levelCode = levelCode;
    }

  public int getLevelCode() {
    return this.levelCode;
  }
}
