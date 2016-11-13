package questions;

public class arrayPr {
	public static void main(String args[]){
		
		String name = "Pooja";
		char nameArr[] = new char[name.length()];
		String revName="";
		
		for(int i=0;i<name.length();i++){
			nameArr[i]= name.charAt(i);
		}
		
		System.out.println(nameArr);
		
		for(int i=name.length()-1;i>=0;i--){
			revName += name.charAt(i);
		}
		
		System.out.println(revName);
	}
	


}
