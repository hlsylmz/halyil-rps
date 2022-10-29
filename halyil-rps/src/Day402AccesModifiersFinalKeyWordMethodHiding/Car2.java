package Day402AccesModifiersFinalKeyWordMethodHiding;

import Day40AccessModifiersFinalKeyWordMehtodHiding.Car;

public class Car2 extends Car {
    public Car2(){
        //model="M3"; default We can not access to default variable from another package
        year=2017; //public everywhere
        //door=4; private we can not access
        engine=5.2; //protected we can access to protected variable from a subclass in another package


    }

}
