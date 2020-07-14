import java.util.Scanner;

// Using regex 
public class Check {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String you want to check...!");
		String h=sc.nextLine();
		String pattern="(.*)(http)(.*)";
		String yy[]=h.split(" ");

		for(int i=0;i<yy.length;i++)
		{
			if(yy[i].matches(pattern))
			{
				System.out.println(yy[i]);
			}
		}
	}
}
