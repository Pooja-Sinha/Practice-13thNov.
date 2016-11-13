package common1s;

/**
 *  This program accepts STring array and replaces every occurence of "ab" as "a"
 * 
 * 
 * **/
public class StrOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r="";
		String []arr ={"ab","abbb","abbbb","bbab"};
		
		StrOperation op = new StrOperation();
		String[] replaced = op.StringOp(arr);
		for(String s:replaced){
			System.out.println(s);
		}

	}

	private String[] StringOp(String[] aa)
	{
		for(int i=0;i<aa.length;i++){
			while(aa[i].contains("ab")){
				aa[i]=aa[i].replace("ab", "a");
			}
		}
		return aa;
	}
}
