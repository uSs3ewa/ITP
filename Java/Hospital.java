public class Hospital {

  public class Bill {
    int id;
    String name;
    int amount;

    public Bill(int id, String name, int amount) {
      this.id = id;
      this.name = name;
      this.amount = amount;
    }
  }
  
  public abstract class User {
    String name;

    public User(String name) {
      this.name = name;
    }
  }

  public class Patient extends User {
    int id;
    String name;
    int amount;
    Bill bill;
    Receptionist recept;
    Doctor doctor;

    public Patient(int id, String name, int amount, Bill bill, Receptionist recept, Doctor doctor) {
      this.id = id;
      this.name = name;
      this.amount = amount;
      this.bill = bill;
      this.recept = recept;
      this.doctor = doctor;
    }
  }

  public class Receptionist extends User {
    int number;
    String[] patients;

    public Receptionist(int number, String[] patients) {
      this.number = number;
      for (int i=0; i<number; i++) {
        this.patients[i] = patients[i];
      }
    }
  }

public class Doctor extends User {
    int number;
    String[] patients;
    public Doctor(int number, String[] patients) {
      this.number = number;
      for (int i=0; i<number; i++) {
        this.patients[i] = patients[i];
      }
    }

  }
}
