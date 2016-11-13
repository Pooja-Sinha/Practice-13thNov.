package common1s;

import java.util.Scanner;

public class reverseString {
	
	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
		System.out.println("Please enter String that u want to be reversed ");
		String str = userInput.nextLine();
		userInput.close();
		
		String revStr= new reverseString().reverStr(str);
		System.out.println("Reversed String "+revStr);
	}
	
	String reverStr(String inputStr){
		String revStr="";
		int length = inputStr.length();
		for(int i=length-1;i>=0;i--){
			revStr+=inputStr.charAt(i);
		}
		return revStr;
	}

}
