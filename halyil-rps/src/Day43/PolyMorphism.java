package Day43;

public class PolyMorphism {
    //poly+Morphism (Many Forms)
    // polymorphism is the ability of the object to take om many forms
    //Polymorphism is when reference type is a parent class/interface and object type is child
//reference type   object type
//Animal a= new Animal();
//Animal a= new Dog();
//Animal a = new Bird();
    public interface MyInterface{}
    public class A implements MyInterface{}
    public class B implements MyInterface{}
    //ClassA a= new ClassA();
    //ClassB b= new ClassB();
    //MyInterface a= new ClassA();
    //MyInterface b= new ClassB();
    //when we call a method, it will call overridden version from a
    //a child class
    /*
    If method is not overridden it will call parent/super class version
    getClass() method helps us to access the object information
    getClass().getName(). returns package.className of the object
    getClass().getSimpleName(): returns just the class name of the object
    Instanceof
    instanceof operator can be used to check if the object is certain class
    Animal a=new Dog();
    if(a instanceof Dog) {
    System.out.println("it is Dog")
    }else{
    System.out.println("it is not Dog")
    }

    Rules
    Reference type can be parent or interface, object can be any extending
    or implementing child class

    reference type decides what is accessible

Casting (down-casting)
Instructs the compiler to change the existing of an object reference to
another type
public class A{
    public void mA(){}
    }
 public class B extends A{
    public void mB(){}
 }

 A obj= new B();
 obj.mA(); is only accessible.Reference is A.

 Casting

       B obj2=  (B) obj
       obj2.mA();
       obj2.mB();

     */







}
