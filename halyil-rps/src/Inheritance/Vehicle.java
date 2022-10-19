package Inheritance;

public class Vehicle {
    private String name;
    private int size;
    private int currentVelocity;
    private int currentDirection;
    /*
    public Vehicle(){
    this("BMW", 3,60,50);
    }
     */

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public Vehicle(String name, int size, int currentVelocity, int currentDirection) {
        this.name = name;
        this.size = size;
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer() :Steering at "+currentDirection + " degrees.");
    }
    void move(int velocity, int direction){
        this.currentDirection=direction;
        this.currentVelocity=velocity;
        System.out.println("Vehicle move() : Moving at "+currentVelocity + " in direction "+currentDirection);
    }


    public void stop(){
        this.currentVelocity=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
