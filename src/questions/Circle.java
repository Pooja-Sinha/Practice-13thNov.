package questions;

public class Circle {

	Operation op;
	double pi = 3.14;
	
	double area(int r){
		op = new Operation();
		double result = pi*op.square(r);
		return result;
	}
	
	public static void main(String args[]){
		Circle c = new Circle();
		System.out.println("Circle area "+c.area(2));
	}
}
