import java.time.LocalDate;
import java.time.Period;

import sun.util.resources.provider.LocaleDataProvider;
public class Age {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalDate birthday = LocalDate.of(2006, 9, 10);
    Period.between(birthday, today).getYears();
  }
}
