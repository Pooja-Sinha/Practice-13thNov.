package questions;

public abstract class Base {

	static void display(){
		System.out.println("Calling base static method");
	}
	
	void print(){
		System.out.println("Base non static method called");
	}
	
	final void hi(){
		System.out.println("hi final method in Base! ");
	}
	
	abstract public void kuchv();
}
