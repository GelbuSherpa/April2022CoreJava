package lec13_02_java_oop_abstraction;

// This is an interface
// An Interface can inherit more than one Interface by extends keyword
// An Interface can't inherit a regular class or an abstract class by extends keyword

// implements keyword can't be used for inheritance inside Interface

public interface Car extends Taxi, Truck {
	
	// Interview question: Can we declare variables inside Interface, and if no, what is their type?
	// the variables inside Interface are final and static in nature.
	public static final int bornYear = 1859;
	
	// Interfaces cannot have constructors
	/*
	public Car () {
		
	}
	*/
	
	// method is declared inside Interface (not implemented)
	// the method which are declared -- called also abstract method
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	public void start(); // void type method
	public abstract void stop(); // void type method
	public String brake(); // return type method
	
	// from Java 1.8, JAVA implemented static and default type method in interface	which are implemented
	// important interview question
	public default void  honk() { // this default is not access modifier
		System.out.println("Honk Feature from Car Interface");
	}
	
	public default String honk1() { // this default is not access modifier, also we can make it return type
		System.out.println("Honk Feature from Car Interface");
		return null;
	}
	
	public static void gear() {
		System.out.println("Gear feature from Car Interface");
	}	

}
