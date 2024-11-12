public class Test {
    class Base {
      protected int m1=0;
      public Base(){};
    }
    class Derived extends Base {
      public int m1=1;
      public Derived(){};
      public void fromderived() {
        System.out.println(this.m1);
      }
      public void frombase() {
        System.out.println(super.m1);
      }
    }
    public static void main(String[] args) {
      //Base b = new Base();
      //Derived d = new Derived();
      //d.fromderived();
      //d.frombase();
      //frombase(d);
    }
}
