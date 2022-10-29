package AbstractClasses;

public abstract class Browser {
    //Browser b=new Browser();//'Browser' is abstract; cannot be instantiated

//What is Abstract Method?
//	- is a method without body/implementation.
//	Can be placed in abstract class or interface

    public abstract void navigate(String url);

    public abstract void displayWebpage();

//Where do you add implementation?
//	- Is added in first concrete class
//	- While adding implementation,
//	all overriding rules should be followed.

    public class Netscape extends Browser {
        public void navigate(String url){
            //code
        }
        public  void displayWebpage(){

        }
    }

    //Can we add non-abstract method in abstract class?
    //	- Yes we can. Abstract class can have
    //	both abstract method and non-abstract method

}

