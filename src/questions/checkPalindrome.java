package questions;

public class checkPalindrome {
	
	public static void main(String args[]){
		System.out.println(palindrome("macpdpcam"));
	}
	
	public static boolean palindrome(String s) {
		  if (s.length() <= 1)
		    return true;
		  else{
			  System.out.println(s.length());
			  System.out.println(s.charAt(s.length()-1));
			  System.out.println(s.substring(1,s.length()-1));
		    return (s.charAt(0) == s.charAt(s.length()-1)) &&
		            palindrome(s.substring(1,s.length()-1));
		  }
		}
	
	/*public static boolean palindrome(String s) {
		System.out.println(s.length());
		  if (s.length() <= 1)
		    return true;
		  else
		  {
			  for(int i=0;i<s.length()/2;i++){
				  if(s.charAt(i)!=s.charAt(s.length()-i-1))
					  return false;
			  }
			  return true;
		  }
		}*/

}
