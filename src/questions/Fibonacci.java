package questions;

public class Fibonacci {
	
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	public void Fibonacci(){
		System.out.println("Method ");
	}
	
	static{
		System.out.println("Before Main()");
	}
	public static void main(String args[]){
		new Fibonacci().printFibSeries();
		new  Fibonacci().Fibonacci();
	}

    void printFibSeries(){
		int a =0, b=1;
		System.out.println(a+"\n");
		System.out.println(b+"\n");
		int count = 1;
		while(count<35){
			System.out.println((a+b)+"\n");
			a=b;
			b=count;
			count= (a+b);
			System.out.println("a=="+a+" b=="+b+" count=="+count);
		}
	}
}
