import java.util.Scanner;

public class Example {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string you want to check..!");
		String h=sc.nextLine();
		
		//String t=" arpit mangal Is eeeeeeeeeeeee  Oooo uuuuu qqqq";
		String word[] =h.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			if(word[i].toLowerCase().contains("a")||word[i].toLowerCase().contains("e")||
					word[i].toLowerCase().contains("i")||word[i].toLowerCase().contains("o")||
					word[i].toLowerCase().contains("u"))
			{
				System.out.println(word[i]);
			}
		}
	}
}
