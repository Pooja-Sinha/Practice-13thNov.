/**
 * 
 */
package questions;

/**
 * @author sudhir_2
 *
 */
public class Operation {

	int square(int r){
		return r*r;
	}
	
	static void fun(int ...a){
		System.out.println(a.length);
		for(int i:a){
			System.out.println(i+" ");
		}
	}
	
	public static void main(String args[]){
		fun(100);
		fun(100,200,300);
		fun();
	}
}
