package AbstractClasses;

public abstract class Bird extends Animal{
    @Override
    void eat() {
        System.out.println("Bird is eating");
    }

   @Override
    void breathe() {

    }
    abstract void fly();
}
