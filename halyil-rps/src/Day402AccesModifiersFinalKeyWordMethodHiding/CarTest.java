package Day402AccesModifiersFinalKeyWordMethodHiding;

import Day40AccessModifiersFinalKeyWordMehtodHiding.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c=new Car();
        //c.model="M3";
        c.year=2017;
      //  c.door=4 private
       // c.engine=5.2; protected we can not access to protected from a class(not subclass) in another package
    }
}
