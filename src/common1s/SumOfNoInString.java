package common1s;

public class SumOfNoInString {
	
	public static void main(String...arg){
		String str[]={"ab12","1abc15","2sd1ff49"};
		/**
		 * generated int array should be =[12,16,52]... Supposed to gen array
		 * */
		int len = str.length;
		
		
		for(String s: str){
			String splitStr[] = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
			int count=0;
			for(String x:splitStr){
				//System.out.println("x "+x);
				try{
					count+=(Integer.parseInt(x));
					System.out.println(count);
				}catch(NumberFormatException e){
					e.printStackTrace();
				}
			}
		}
		
			 
	}

}
