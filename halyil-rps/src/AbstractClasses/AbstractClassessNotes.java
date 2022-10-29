package AbstractClasses;

public class AbstractClassessNotes {
    /*
    Abstraction Class notes
    Abstraction is concentrating on essential/important
    things and not worrying about details
    is concentrating on name of the action/behavior, without thinking about
    implementations
    Vehicle
    -move
    -stop
    -turn
    - addfuel
    ........
    Abstractions can be done in 2 ways: Abstract classes and Interface
    Abstraction helps with "organizing the code", "reusing the code", "less duplicate code",
    Can we instantiate abstract class?
    -No we can not create object from abstract class
    public abstract class Browser{}
    Browser browser=new Browser(); Error
    What is abstract method?
    - is a method without body/implementation. Can be placed in abstract class or interface
    public abstract class Browser{
    public abstract void navigate(String url);
    public abstract void displayWebpage();
    }
    Where do you add implementation?
    -is added in first concrete class
    -while adding implementation, all overriding rules should be followed.

    public class Netscape extends Browser{
    public abstract void navigate (String url){
    //code
    }
    public abstract void displayWebpage(){
    //code
    }
    }
    Can we add non-abstract method in abstract class
    -Yes we can. Abstract class can have both abstract method and non-abstract method
    public abstract class Browser{
    public abstract void navigate (url);
    public abstract void displayWebpage();
    public void close(){
    //code
    }
    }

    Is it mandatory for abstract class to have abstract method?
    -No it is not. Abstract class can have 0 abstract method.
    public abstract class Browser{
    public void close(){

    }
    }

    Can we add constructor in abstract class?
    -Yes we can.
    public abstract class Browser{
    public Browser(){
    System.out.println("Creating a browser")
    }
    }
    if we can not instantiate abstract class, how we can call the constructor
    -The constructor of abstract class can be called from a subclass using super keyword
    public abstract class Browser{
    public Browser(){
    System.out.println("Creating a constructor")
    }
    public class Netscape extends Browser{
    public Netscape(){
    super();
    }
    }
    Can you add instance or static variables into abstract class
    -Yes we can have instance variables in abstract class
    public abstract class Browser{
    String name;
    static int id;
    public Browser(){
    System.out.println("Creating a constructor");
    }
    }

    -Variables can not be abstract
    abstract int id;//Error


    can you add instance or static init block?
    -Yes we can

    Can an abstract class extend another abstract class?
    yes it can
    public abstract class A{}
    public abstract class B extends A{}


    can an abstract class extend another non-abstract class?
    yes it can
    public class A{}
    public abstract class A extends B{}
    public class C extends A,B{}//Error

    can we add static method into abstract class?
    yew we can
    public abstract class A{
    public static void methodX(){

    }
    }

    can a method be abstract and final in abstract class?
    no it can not
    public abstract class Browser{
    public abstract final void navigate(String url); //Error
    public abstract void displayWebpage();
    }
  Cam abstract method be protected private and default?
  -private NO
  -default YES
  -protected YES

  When an abstract class extends another abstract class, does it
  require to override/implement abstract methods from parent
  -No it does not require
  -First concrete sub class i required to implement all abstract methods
  public abstract class Phone{
  public abstract void call(){}
  }
  public abstract class MobilePhone extends Phone{
  public abstract void text(){}
  }

  public Nokia extends MobilePhone{
  public void call(){
  //code
  }
  public void text(){
  }
  }
  public Iphone extends MobilePhone{
  public void call(){
  //code
  }
  public void text(){
  //code
  }
  }
  public IphoneX extends Iphone{
  //no required to override
  }






     */
}
