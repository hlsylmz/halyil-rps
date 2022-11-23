package AbstractClasses;

public class AbstractClassVersusInterface {
/*

Abstract class vs Interface


- Abstract classes and Interfaces are used to achieve abstraction in Java

- We can not instantiate abstract classes and interfaces

	public abstract class Food{

	}

	public interface Cookable{

	}

	Food food = new Food();          //Illegal
	Cookacle cook = new Cookable();  //Illegal


- We use abstract classes for setting foundation for sub classes. It is normally a general idea

- Interfaces are used to add a feature to classes by providing abstract methods

- Class can extends ONE abstract class

- Class can implement MULTIPLE interfaces

	public interface Cookable{}
	public interface Bakeable{}
	public abstract class Food{}

	public class Bread extends Food implements Bakeable{}

	public class Patotoes extends Food implements Cookable,Bakeable{}



- Methods:

	- Abstract classes can have abstract and non-abstract methods

	- Interfaces can have abstract, default, static methods

	- Concrete class is responsible for providing implementation

	public abstract class Food{

		public abstract void eat();  //void eat(); - > it will not work

		public void serve(){  //instance method
			//code
		}

		public static void buy(){ //static method
			//code
		}

	}

	public interface Cookable{

		public abstract void cook();

		void store();

	}


	public interface Bakeable{

		public default void bakeInOven(){
			//code
		}

		public static void bake(String str){
			//code
		}

	}

	public class Bread extends Food implements Bakeable{

		@Override
		public abstract void eat(){
			//code
		}

	}

	public class Patotoes extends Food implements Cookable,Bakeable{

		@Override
		public abstract void eat(){
			//code
		}

		@Override
		public void cook(){
			//code
		}

		@Override
		public void store(){
			//code
		}


	}


- Variables

	- Abstract classes can have instance, static and final variables

	- Interfaces can only have "public static final" variables


	public abstract class Food{

		String name;
		public static int amount;
		public final boolean EDIBLE = true;

	}

	publci interface Cookable{

		public static final String ACTION = "Cook";

		boolean CAN_BE_COOKED = true;  // same as public static final boolean CAN_BE_COOKED
	}

- Constructor

	- Abstract classes can have constructors

	- Interfaces can not have constructors


	public abstract class Food{

		String name;

		public Food(String name){
			this.name=name;
		}

		public Food(){
			this.name="Pizza";
		}

	}

	public interface Cookable{

		//We can not add constructor
	}


	public class Pizza extends Food{

		public Pizza(){
			super("Pasta");
		}

	}

-Access Modifiers

	- Abstract Classes can use all access modifiers with variables and methods

	- Interfaces can only use public access modifier

	(Java-11 private final avaiable too - dont worry)

	public abstract class Food{

		public String name;
		protected int quantity;
		boolean isSpicy;
		private boolean isTasty;
	}

	public interface Cookable{

		public static final String ACTION="Cookable";

	}


- Inheritance

	- Abstract classes can extend a single abstract or non-abstract class and implement interfaces

	- Interfaces can extend multiple interfaces

	- Interfaces support multiple inheritance

	- Interfaces can not extend classes

	public abstract class Food{}

	public interface Fryable{}

	public interface Grillable{}

	public interface Cookable extends Fryable,Grillable{}

	public abstract class Soup extends Food{}

















/*
Difference between abstract class and inte rface
Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can’t be instantiated.
But there are many differences between abstract class and interface that are given below.
Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn’t support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can’t provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
7) An abstract class can be extended using keyword “extends”.	An interface class can be implemented using keyword “implements”.
8) A Java abstract class can have class members like private, protected, etc.	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}
Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).
Example of abstract class and interface in Java
Let’s see a simple example where we are using interface and abstract class both.
//Creating interface that has 4 methods
interface A{
void a();//by default, public and abstract
void b();
void c();
void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class B implements A{
public void c(){System.out.println("I am C");}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends B{
public void a(){System.out.println("I am a");}
public void b(){System.out.println("I am b");}
public void d(){System.out.println("I am d");}
}

//Creating a test class that calls the methods of A interface
class Test5{
public static void main(String args[]){
A a=new M();
a.a();
a.b();
a.c();
a.d();
}}
Output:
       I am a
       I am b
       I am c
       I am d


 */

}
