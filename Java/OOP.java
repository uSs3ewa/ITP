import java.awt.Point;

public class Program {
      
    public static void main(String[] args) {
         
      Person undef = new Person();
      undef.displayInfo();
       
      Person tom = new Person("Tom");
      tom.displayInfo();
       
      Person sam = new Person("Sam", 25);
      sam.displayInfo();

      Point p = new Point(1,2);
      System.out.println(p.getX());
      System.out.println(p.getY());
      System.out.println(Math.pow(5,2));

    Person test = new Person("Name", 18);
    //displayInfo(test);
    }
}
class Person{
     
    String name;    // имя
    int age;        // возраст
    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }
    /*конец блока инициализатора*/
    Person(){
         
    }
    /*
     * Person()
    {
        this("Undefined", 18);
    }
    */
    Person(String name)
    {
        this(name, 18);
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
