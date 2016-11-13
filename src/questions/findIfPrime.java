package questions;

import java.util.Scanner;

public class findIfPrime {
	public static void main(String args[]){
		Scanner inputFromUser = new Scanner(System.in);
		System.out.println("Please enter no. to know whether it is prime");
		String num=inputFromUser.nextLine();
		int n = 0;
		try{
		    n = Integer.parseInt(num);
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		
		findIfPrime obj = new findIfPrime();
		boolean flag = obj.checkIfPrime(n);
		
		if(flag)
			System.out.println("The entered no. is composite");
		else
			System.out.println("The entered no.is Prime");
				
		
	}
	
	boolean checkIfPrime(int checkN){
		for(int i=2;i<(checkN/2);i++){
			if(checkN%i==0)
				return true;			
		}
		return false;
	}
}
