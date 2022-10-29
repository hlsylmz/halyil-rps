package AbstractClasses;

public abstract class Animal {
    //instance variable
    String name;
    //Static variable
    private static int age;
    //abstract method
    abstract void eat(); //nobody
    //abstract method
    abstract void breathe(); //nobody

    //instance method
    private void sing(){
        System.out.println("Animal is singing");
    }
    //Constructo
    public Animal(){

    }
    public Animal (int age){
        this.age=age;
    }
    //instance block
    {
        System.out.println("This is instance block");
    }

    //static block
    static{
        System.out.println("This is static block");
    }
}
