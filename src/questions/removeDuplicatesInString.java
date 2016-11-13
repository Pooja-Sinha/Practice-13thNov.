package questions;

import java.util.Scanner;

public class removeDuplicatesInString {

	public static void main(String myArgs[]){
		System.out.println("Enter a string with duplicate characters :");
		Scanner reader = new Scanner(System.in);
		String inputStr = reader.nextLine();
		reader.close();
		
		//char[] inputStrChar = inputStr.toCharArray();
		char ch=inputStr.charAt(0);
		String ans=" ";
		
		for(int i=0;i<inputStr.length();i++){
			
			ans+=ch;
			while(ch==(inputStr.charAt(++i))&& i<inputStr.length()){
				//nothing
			}
			ch=inputStr.charAt(i);
		}
		
		System.out.println("ANs "+ans);
			
	}
}
