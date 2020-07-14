
public class Mutable {

	public static void main(String[] args)
	{
		
		String text="This is Arpit Mangal1,This is Arpit Mangal2,This is Arpit Mangal3,This is Arpit Mangal4,This is Arpit Mangal5";
		String sentence[]=text.split(",");
		
		System.out.println("This is length of string  " + sentence.length);
	
		System.out.println("This is hashcode of string  "+sentence.hashCode());
		
		String mytext="";
		for(int i=0;i<sentence.length;i++)
		{
			mytext=mytext.concat(sentence[i].concat("\n"));
		}
		System.out.println(mytext);
	
	}
}
