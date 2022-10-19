package Inheritance;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGear){
        this.currentGear=currentGear;
    }
    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() : Velocity "+speed+ " direction "+ direction);
    super.move(speed,direction);
    }
    public void move(int velocity, int direction){
       setCurrentDirection(velocity+10);
       setCurrentDirection(direction+10);
        System.out.println("Vehicle.move(): Moving at " +getCurrentVelocity()+ " in direction "+getCurrentDirection());
    }


}
