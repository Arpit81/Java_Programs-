import java.util.Scanner;

public class String_Methid {
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter String");      
         String  s= sc.next();
   
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}

}
