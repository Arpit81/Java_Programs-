
public class ReverseString {

	public static void main(String[] args) {
	
		//using own logic reverse the string 
		String s="this is arpit mangal ,programmer";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		System.out.println();
		

		// using StringBuffer reverse String 
		StringBuffer sb=new StringBuffer(s);
	System.out.print(sb.reverse());
	}
	

}
