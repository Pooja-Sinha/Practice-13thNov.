package questions;

import java.util.Scanner;

public class calStringLength {
	
	public static void main(String args[]){
		System.out.println("Enter String ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		scanner.close();
		System.out.println(inputString);
		System.out.println(inputString.length());
		
		char[] str = inputString.toCharArray();
		
		int n =0;
		n=inputString.indexOf('\n');
		/*while(str[n]!='\0'){
			System.out.println(str[n]);
			n++;
		}*/
		System.out.println("Str len "+n);
	}

}
