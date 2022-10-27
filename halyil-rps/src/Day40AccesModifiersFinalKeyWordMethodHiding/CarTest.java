package Day40AccesModifiersFinalKeyWordMethodHiding;

public class CarTest {
    public static void main(String[] args) {
        Car c=new Car();
        c.model="m3";
        c.year=2017;
        //c.door=4; private
        c.engine=5.2;
    }
}
