import java.util.Scanner;

public class Example2 {

	public static void main(String[] args)
	{
		
		
		
		String h="anjaj1 1jjbkb 2jb2jb jb2hku2b ji4u jivshsdj faiojja juuebju arpit mangal  java doveleper";
		String word[]=h.split(" ");
		for(int i=0;i<word.length;i++) {
			
			char c []=word[i].toCharArray();
			for(int j=0; j<c.length; j++)
			{
				if(Character.isDigit(c[j]))
				{
					System.out.println(word[i]);
					
			

					
				}
			
			}
			
			
		}
	}
}
